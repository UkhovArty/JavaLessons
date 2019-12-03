package ru.sberbank.Serializer;

public class JsonArraySerializer<T extends Object> {
    public void SerializeArray(T[] o) throws IllegalAccessException {
        System.out.println("{");
        for (T t : o) {
            if (t.getClass().isPrimitive() || t.getClass().equals(String.class) || t.getClass().getSuperclass().equals(Number.class) || t.getClass().equals(Character.class)) {
                System.out.print("\t");
                PrimitiveJsonSerializer primitiveSerializer = new PrimitiveJsonSerializer();
                primitiveSerializer.serializePrimitive(t);
            } else {
                SerializationUtils serializationUtils = new SerializationUtils();
                serializationUtils.serializeObjectUtils(t);
            }
        }
        System.out.println("},");
    }
}

