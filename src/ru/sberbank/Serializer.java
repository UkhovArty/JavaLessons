package ru.sberbank;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Serializer<T extends Object> {
    public void objectAsJson(T o) throws IllegalAccessException {
        if (o.getClass().isPrimitive() || o instanceof String || o instanceof Number || o instanceof Character) {
            System.out.print('"');
            System.out.print(o);
            System.out.println('"' + ",");
        } else {
            ObjectStructureGetter getter = new ObjectStructureGetter();
            Map<String, Object> fields = new HashMap();
            fields = getter.GetObjFields(o);
            for (Object obj : fields.keySet()) {
                System.out.print('"' + obj.toString() + '"' + ": ");
                if (fields.get(obj).getClass().isArray()) {
                    ArraySerializer serializer = new ArraySerializer();
                    serializer.SerializeArray(((Object[]) fields.get(obj)));
                } else {
                    NestedObjSerializer nestedObjSerializer = new NestedObjSerializer();
                    nestedObjSerializer.serializeNestedObj(fields.get(obj));
                }
            }
        }
    }
}
