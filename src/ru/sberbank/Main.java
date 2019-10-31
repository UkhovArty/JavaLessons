package ru.sberbank;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        Example exanple = new Example();
        Serializer serializer = new Serializer();
        serializer.objectAsJson(exanple);
    }
}
