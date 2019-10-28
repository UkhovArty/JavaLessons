package ru.sberbank;

public class ArraySerializer<T extends Object> {
    public void SerializeArray(T[] o) {
        for (T t: o) {
            System.out.println('"' + t.toString() + '"' + ",");
        }
    }
}
