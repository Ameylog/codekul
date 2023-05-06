package collectionframework;

import java.util.*;

public class MapStoreInArrayList {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Pune");
        map.put(2, "Mumbai");
        map.put(3, "Nagpur");

        Map<Integer, String> map1 = new HashMap<>();
        map1.put(4, "Satara");
        map1.put(5, "Delhi");
        map1.put(6, "Kolkata");

        Map<Integer, String> map2 = new HashMap<>();
        map1.put(7, "Kasmir");
        map1.put(8, "New Delhi");
        map1.put(9, "Kochi");

        List<Map<Integer, String>> list = Arrays.asList(map, map1, map2);

        list.forEach(s -> {
           s.forEach((k, v) -> {
            System.out.println("Key-> " + k + " Values->" + v);
            });
            System.out.println();
        });
    }
}
