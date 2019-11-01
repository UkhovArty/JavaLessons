package ru.sberbank;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Serializer<T extends Object> {
    public void objectAsJson(T o) throws IllegalAccessException {
        if (o.getClass().isPrimitive() || o.getClass().equals(String.class) || o.getClass().getSuperclass().equals(Number.class) || o.getClass().equals(Character.class)) {
            PrimitiveSerializer primitiveSerializer = new PrimitiveSerializer();
            primitiveSerializer.serializePrimitive(o);
        } else {
            ObjectStructureGetter getter = new ObjectStructureGetter();
            Map<String, Object> fields = new HashMap();
            fields = getter.GetObjFields(o);
            for (Object obj : fields.keySet()) {
                System.out.print('"' + obj.toString() + '"' + ": ");
                if (fields.get(obj).getClass().isArray()) {
                    ArraySerializer serializer = new ArraySerializer();
                    serializer.SerializeArray(((Object[]) fields.get(obj)));
                }
                else if (fields.get(obj).getClass().isPrimitive() || fields.get(obj).getClass().equals(String.class) || fields.get(obj).getClass().getSuperclass().equals(Number.class) || fields.get(obj).getClass().equals(Character.class)) {
                    PrimitiveSerializer primitiveSerializer = new PrimitiveSerializer();
                    primitiveSerializer.serializePrimitive(fields.get(obj));
                } else {
                    NestedObjSerializer nestedObjSerializer = new NestedObjSerializer();
                    nestedObjSerializer.serializeNestedObj(fields.get(obj));
                }
            }
        }
    }
}
