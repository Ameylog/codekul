package collectionframework;

import java.util.HashMap;
import java.util.Map;

/**
 * Map - Key,value pair. Store multitype
 */
public class MapDemo {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Pune");
        map.put(2, "Mumbai");
        map.put(3, "Nagpur");

        /// Iterate map
        map.forEach((k, v) -> {
             System.out.println("Key-> " + k + " Values->" + v);
         }
        );

        //// Other Method to iterate map
        for(Map.Entry<Integer,String> m:map.entrySet()){    // Not stored duplicate value
            System.out.println(m.getKey()+" "+m.getValue());
        }


//        for(Map.Entry<Integer,String> m:map.entrySet()){
//            System.out.println(m.getKey()+" "+m.getValue());
//        }
    }
}
