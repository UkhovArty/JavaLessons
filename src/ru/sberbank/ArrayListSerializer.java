package ru.sberbank;

import java.util.ArrayList;

public class ArrayListSerializer<T extends Object> {
    public void serializeArrayList(ArrayList<T> list) {
        ArraySerializer serializer = new ArraySerializer();
        serializer.SerializeArray(list.toArray());
    }
}