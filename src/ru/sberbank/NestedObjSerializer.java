package ru.sberbank;

public class NestedObjSerializer {
    public void serializeNestedObj(Object obj) throws IllegalAccessException {
        Serializer serializer = new Serializer();
        serializer.objectAsJson(obj);
    }
}