package sberbank2;

public class Main {
    public static void main(String[] args) {
        CountMap<Integer> map = new CountMapImplementation<>();
        map.add(10);
        map.add(10);
        map.add(5);
        map.add(6);
        map.add(5);
        map.add(10);
        int count = map.getCount(5);
        int count1 = map.getCount(6);
        int count2 = map.getCount(10);
        //System.out.println(count);
        //System.out.println(count1);
        //System.out.println(count2);
        CountMap<Integer> map1 = new CountMapImplementation<>();
        map1.add(5);
        map1.add(6);
        map1.add(10);
        map1.add(12);
        map1.addAll(map);
        System.out.println(map1.getCount(5));
        System.out.println(map1.getCount(6));
        System.out.println(map1.getCount(10));
        System.out.println(map1.getCount(12));


    }
}
