package collectionframework;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args) {
        TreeMap<Integer,String>treeMap=new TreeMap<>();

        treeMap.put(1,"Pune");
        treeMap.put(2,"Mumbai");
        treeMap.put(3,"Chennai");
        treeMap.put(4,"Delhi");

        System.out.println(treeMap);

        System.out.println(treeMap.subMap(2,4));
        System.out.println(treeMap.descendingMap());
        System.out.println(treeMap.floorKey(1));
        System.out.println(treeMap.ceilingKey(6));
        System.out.println(treeMap.ceilingEntry(6));
        System.out.println(treeMap.floorEntry(6));
        System.out.println(treeMap.higherKey(4));
        System.out.println(treeMap.higherEntry(4));
        System.out.println(treeMap.firstKey());
    }
}
