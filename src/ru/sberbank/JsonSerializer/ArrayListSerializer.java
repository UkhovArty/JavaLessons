package ru.sberbank.JsonSerializer;

import java.util.ArrayList;

public class ArrayListSerializer<T extends Object> {
    public void serializeArrayList(ArrayList<T> list) throws IllegalAccessException {
        JsonArraySerializer serializer = new JsonArraySerializer();
        serializer.SerializeArray(list.toArray());
    }
}
