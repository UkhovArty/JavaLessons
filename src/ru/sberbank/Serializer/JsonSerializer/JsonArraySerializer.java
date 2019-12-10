package ru.sberbank.Serializer.JsonSerializer;

import ru.sberbank.Serializer.Serializer;

public class JsonArraySerializer<T extends Object> {
    public void SerializeArray(T[] o, String obj) throws IllegalAccessException {
        System.out.print('"' + obj.toString() + '"' + ": ");
        System.out.println("{");
        for (T t : o) {
            System.out.print("\t");
            Serializer serializer = new JsonSerializer<>();
            serializer.serializeObject(t);
        }
        System.out.println("},");
    }
}

