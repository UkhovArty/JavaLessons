package ru.sberbank;

public class NestedObjSerializer {
    public void serializeNestedObj(Object obj) throws IllegalAccessException {
       // System.out.println("{");
        Serializer serializer = new Serializer();
        serializer.objectAsJson(obj);
        //System.out.println("}");
    }
}