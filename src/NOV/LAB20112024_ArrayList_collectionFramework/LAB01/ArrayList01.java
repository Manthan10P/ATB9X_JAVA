package NOV.LAB20112024_ArrayList_collectionFramework.LAB01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList01 {
    public static void main(String[] args) {

        List list = new ArrayList();
        list.add("Manthan");
        list.add("Pooja");
        list.add("Anita");
        list.add("Suresh");
        list.add(true);
        list.add(5);
        list.add(6.7);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.lastIndexOf(5));
        System.out.println(list.indexOf(7));
        System.out.println(list.contains("Pooja"));

        System.out.println("----------------Default Loop");
        int i;
        for (i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("--------for each loop");
        for (Object o: list){
            System.out.println(o);
        }

        System.out.println("---------------- TO Print Arraylist Iterator");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}