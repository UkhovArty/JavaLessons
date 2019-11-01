package ru.sberbank;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException {
        SomeClass someClass = new SomeClass();
        Example exanple = new Example(someClass);
        Serializer serializer = new Serializer();
        serializer.objectAsJson(exanple);
    }
}
