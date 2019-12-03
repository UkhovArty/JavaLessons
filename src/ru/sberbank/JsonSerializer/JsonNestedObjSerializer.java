package ru.sberbank.JsonSerializer;

public class JsonNestedObjSerializer {
    public void serializeNestedObj(Object obj) throws IllegalAccessException {
        System.out.println("{");
        SerializationUtils serializationUtils = new SerializationUtils();
        serializationUtils.serializeObjectUtils(obj);
    }
}