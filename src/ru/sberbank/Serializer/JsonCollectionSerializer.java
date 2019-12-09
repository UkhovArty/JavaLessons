package ru.sberbank.Serializer;

import java.util.Collection;

public class JsonCollectionSerializer<T extends Object> {
    public void SerializeCollection(Collection<T> collection) throws IllegalAccessException {
        JsonArraySerializer serializer = new JsonArraySerializer();
        serializer.SerializeArray(collection.toArray(), collection.toString());
    }
}
