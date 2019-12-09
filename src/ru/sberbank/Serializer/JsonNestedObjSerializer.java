package ru.sberbank.Serializer;

public class JsonNestedObjSerializer {
    public void serializeNestedObj(Object obj, String o) throws IllegalAccessException {
        System.out.print('"' + o + '"' + ": ");
        System.out.println("{");
        System.out.print("\t");
        Serializer serializer = new JsonSerializer<>();
        serializer.serializeObject(obj);
    }
}