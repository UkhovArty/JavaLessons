package ru.sberbank.Serializer;

public class JsonNestedObjSerializer {
    public void serializeNestedObj(Object obj, String o) throws IllegalAccessException {
        System.out.print('"' + o + '"' + ": ");
        System.out.println("{");
        Serializer serializer = new DecoratorForJsonSerializer();
        ((DecoratorForJsonSerializer) serializer).serializeJsonObject(obj);
    }
}