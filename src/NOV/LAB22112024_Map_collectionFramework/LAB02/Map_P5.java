package NOV.LAB22112024_Map_collectionFramework.LAB02;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;

public class Map_P5 {
    public static void main(String[] args) {
        //Map = key value and 1 null value
        // Hashtable = Syncronised,slow and Lagecy Class
        // T1 and T2 use one by one

        Hashtable<Integer,String> ht1 = new Hashtable<>();
        ht1.put(1,"one");
        ht1.put(2,"Two");
        ht1.put(3,"Three");
        //ht1.put(4,null);  //NullPointerException
        //ht1.put(null,"Five");  //NullPointerException
        System.out.println(ht1);

        HashMap<Integer,String> ht2 = new HashMap<>();
        ht2.put(1,"one");
        ht2.put(2,"Two");
        ht2.put(3,"Three");
        ht2.put(4,null);
        ht2.put(null,"Five");
        System.out.println(ht2);


        //For Legacy use enumration

        Enumeration<Integer> e = ht1.keys();
        System.out.println(e.nextElement());
        System.out.println(ht1.get(e.nextElement()));






    }
}