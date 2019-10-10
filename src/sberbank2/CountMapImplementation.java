package sberbank2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountMapImplementation<K> implements CountMap<K> {
    public Map<K, Integer> list = new HashMap<>();

    @Override
    public void addAll(CountMap source) {
        for (Object key : source.toMap().keySet()) {
            if (list.containsKey(key)) {
                Integer put;
                put = source.getCount(key) + list.get(key);
                list.put((K) key, put);
            } else {
                list.put((K) key, source.getCount(key));
            }
        }
    }

    @Override
    public void add(K key) {
        if (!list.containsKey(key)) {
            list.put(key, 1);
        } else {
            list.put(key, list.get(key) + 1);
        }
    }

    @Override
    public int getCount(K key) {
        return list.get(key);
    }

    @Override
    public Map toMap() {
        return list;
    }

    @Override
    public void toMap(Map destination) {
        destination = list;
    }

    @Override
    public int remove(K key) {
        int i = list.get(key);
        list.remove(key);
        return i;
    }

    @Override
    public int size() {
        return list.size();
    }
}
