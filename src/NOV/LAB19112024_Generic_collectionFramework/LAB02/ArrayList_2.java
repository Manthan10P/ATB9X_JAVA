package NOV.LAB19112024_Generic_collectionFramework.LAB02;

import java.util.List;
import java.util.ArrayList;

public class ArrayList_2 {
    public static void main(String[] args) {
        List list = (List) new ArrayList_2();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        //list.add(3);

        System.out.println(list.size());
        System.out.println(list.contains(2));
        System.out.println(list.isEmpty());
        System.out.println(list.indexOf(3));
        System.out.println(list.lastIndexOf(2));

    }
}