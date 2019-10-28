package ru.sberbank;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionSerializer<T extends Object> {
    public void SerializeCollection(Collection<T> collection) {
        ArraySerializer serializer = new ArraySerializer();
        serializer.SerializeArray(collection.toArray());
    }
}
