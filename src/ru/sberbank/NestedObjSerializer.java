package ru.sberbank;

public class NestedObjSerializer {
    public void serializeNestedObj(Object obj) throws IllegalAccessException {
        System.out.println("{");
        System.out.print("\t");
        Serializer serializer = new Serializer();
        serializer.objectAsJson(obj);
        System.out.println("},");
    }
}