package ru.sberbank.Serializer;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException {
        SomeClass someClass = new SomeClass();
        Example exanple = new Example(someClass);
        JsonSerializer serializer = new JsonSerializer();
        serializer.serializeObject(exanple);

//        Serializer xmlSerializer = new XMLSerializer();
  //      xmlSerializer.serializeObject(exanple);
    }
}
