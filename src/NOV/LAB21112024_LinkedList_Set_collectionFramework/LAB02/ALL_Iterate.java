package NOV.LAB21112024_LinkedList_Set_collectionFramework.LAB02;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class ALL_Iterate {
    public static void main(String[] args) {
        List<String> mylist  = new ArrayList<>();
        mylist.add("Manthan");
        mylist.add("Panchal");
        mylist.add("Why are you here");
        System.out.println(mylist);

        System.out.println("-- To Print Arraylist -- ");
        for (String str : mylist){
            System.out.println(str);
        }
        System.out.println("to print Arraylist 2");
        for (int i = 0; i< mylist.size(); i++){
            System.out.println(mylist.get(i));
        }
        //iterator
        System.out.println("to print Arraylist 3");
        Iterator<String> iterator = mylist.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}