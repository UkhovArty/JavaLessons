package ru.sberbank.JsonSerializer;

import java.util.HashMap;
import java.util.Map;

public abstract class Serializer {
    void serializeObject(Object o) throws IllegalAccessException {
        if (o.getClass().isPrimitive() || o.getClass().equals(String.class) || o.getClass().getSuperclass().equals(Number.class) || o.getClass().equals(Character.class)) {
            serializePrimitive(o);
        } else {
            ObjectStructureGetter getter = new ObjectStructureGetter();
            Map<String, Object> fields = new HashMap();
            fields = getter.GetObjFields(o);
            for (Object obj : fields.keySet()) {
                if (fields.get(obj).getClass().isArray()) {
                    serializeArray(((Object[]) fields.get(obj)));
                } else if (fields.get(obj).getClass().isPrimitive() || fields.get(obj).getClass().equals(String.class) || fields.get(obj).getClass().getSuperclass().equals(Number.class) || fields.get(obj).getClass().equals(Character.class)) {
                    serializePrimitive(obj);
                } else {
                    serializeNestedObject(obj);
                }
            }
        }
    }

    abstract void serializeNestedObject(Object obj);

    abstract void serializeArray(Object[] o);

    abstract void serializePrimitive(Object obj);
}

