package ru.sberbank.JsonSerializer;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException {
        SomeClass someClass = new SomeClass();
        Example exanple = new Example(someClass);
        JsonSerializer serializer = new JsonSerializer();
        serializer.objectAsJson(exanple);
        Serializer xmlSerializer = new XMLSerializer();
        xmlSerializer.serializeObject(exanple);
    }
}
