package ru.sberbank.Serializer;

import java.util.HashMap;
import java.util.Map;

public abstract class Serializer {
    public void serializeObject(Object o) throws IllegalAccessException {
        if (o.getClass().isPrimitive() || o.getClass().equals(String.class) || o.getClass().getSuperclass().equals(Number.class) || o.getClass().equals(Character.class)) {
            serializePrimitive(o, "");
        } else {
            ObjectStructureGetter getter = new ObjectStructureGetter();
            Map<String, Object> fields = new HashMap();
            fields = getter.GetObjFields(o);
            for (Object obj : fields.keySet()) {
                if (fields.get(obj).getClass().isArray()) {
                    serializeArray(((Object[]) fields.get(obj)), obj.toString());
                } else if (fields.get(obj).getClass().isPrimitive() || fields.get(obj).getClass().equals(String.class) || fields.get(obj).getClass().getSuperclass().equals(Number.class) || fields.get(obj).getClass().equals(Character.class)) {
                    serializePrimitive(fields.get(obj), obj.toString());
                } else {
                    serializeNestedObject(fields.get(obj), (String) obj);
                }
            }
        }
    }

    public abstract void serializeNestedObject(Object obj, String o) throws IllegalAccessException;

    public abstract void serializeArray(Object[] o, String obj) throws IllegalAccessException;

    public abstract void serializePrimitive(Object obj, String o);
}

