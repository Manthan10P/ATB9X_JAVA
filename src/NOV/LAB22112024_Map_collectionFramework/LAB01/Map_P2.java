package NOV.LAB22112024_Map_collectionFramework.LAB01;

import java.util.HashMap;
import java.util.Map;

public class Map_P2 {
    public static void main(String[] args) {
        // this 3 are same
        //Map<String,Integer> map = new HashMap<String,Integer>();
        //Map<String,Integer> map = new HashMap<>();
        Map<String,Integer> map = new HashMap();

        //Data types different
        // Map map = new HashMap();

        //duplicat is not allowed
        map.put("id", 1);
        map.put("id",1);
        map.put("id",2);
        map.put("id2",5);
        map.put("id3",23);
        map.put("Null",100);
        map.put("Null1",101);
        map.put("id4",null);
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.containsKey("id"));
        System.out.println(map.containsValue(100));
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.get("id3"));

    }
}