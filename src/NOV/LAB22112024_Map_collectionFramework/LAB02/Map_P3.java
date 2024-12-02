package NOV.LAB22112024_Map_collectionFramework.LAB02;

import java.util.HashMap;
import java.util.Map;

public class Map_P3 {
    public static void main(String[] args) {

        Map<String,Integer> map = new HashMap<>();
        map.put("id", 1);
        map.put("id",1);
        map.put("id",2);
        map.put("id2",5);
        map.put("id3",23);
        map.put("Null",100);

        // Itreter
        for(Map.Entry<String,Integer> item : map.entrySet()){
            System.out.println(item.getKey()+" - " + item.getValue());
        }
    }
}
