package sberbank2;

import java.util.Map;

public interface CountMap<K> {
    void add (K key);

    int getCount (K key);

    Map toMap ();

    <T> void toMap (Map<K, ? extends T> destination);

    int remove (K key);

    int size ();

    <K> void addAll(CountMap<? extends K> source);
}
