package sberbank1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CollectionUtils {
    public static <T> void addAll(List<? extends T> source, List<? super T> destination) {
        destination.addAll(source);
    }

    public static <T> List newArrayList() {
        List<T> ts = new ArrayList<>();
        return ts;
    }

    public static <T> int indexOf(List<? extends T> source, T o) {
        return source.indexOf(o);
    }

    public static <T> List limit(List<? extends T> source, int size) {
        return source.subList(0, size);
    }

    public static <T> void add(List<? super T> source, T o) {
        source.add(o);
    }

    public static <T> void removeAll(List<? super T> removeFrom, List<? extends T> c2) {
        removeFrom.removeAll(c2);
    }

    public static <T> boolean containsAll(List<? super T> c1, List<? extends T> c2) {
        return c1.containsAll(c2);
    }

    public static <T> boolean containsAny(List<? super T> c1, List<? extends T> c2) {
        int counter = 0;
        for (T t : c2) {
            if (c1.contains(t)) {
                counter++;
            }
        }
        return counter != 0;
    }

    public static <T extends Comparable> List range(List<? extends T> list, T min, T max) {
        List<? super T> list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).compareTo(min) < 0 && list.get(i).compareTo(max) > 0) {
                list1.add(list.get(i));
            }
        }
        return list1;
    }

    public static <T> List<? super T> range(List<? extends T> list, T min, T max, Comparator<T> comparator) {
        List<? super T> list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (comparator.compare(list.get(i), min) > 1 && comparator.compare(list.get(i), min) < -1) {
                list1.add(list.get(i));
            }
        }
        return list1;
    }
}
