package ru.sberbank;

import java.util.HashMap;
import java.util.Map;

public class ArraySerializer<T extends Object> {
    public void SerializeArray(T[] o) throws IllegalAccessException {
        System.out.println("{");
        for (T t : o) {
            Serializer serializer = new Serializer();
            serializer.objectAsJson(t);
        }
        System.out.println("},");
    }
}

