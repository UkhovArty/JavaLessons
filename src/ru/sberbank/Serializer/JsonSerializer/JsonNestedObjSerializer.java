package ru.sberbank.Serializer.JsonSerializer;

import ru.sberbank.Serializer.Serializer;

public class JsonNestedObjSerializer {
    public void serializeNestedObj(Object obj, String o) throws IllegalAccessException {
        System.out.print('"' + o + '"' + ": ");
        System.out.println("{");
        Serializer serializer = new DecoratorForJsonSerializer();
        ((DecoratorForJsonSerializer) serializer).serializeJsonObject(obj);
        System.out.println("}");
    }
}