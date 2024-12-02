package NOV.LAB21112024_LinkedList_Set_collectionFramework.LAB02;

import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        // First in First out

        //Stack s = new Stack();
        //s.add("Manthan");
        //s.add("Panchal");
        //s.add(45);
        //s.add(true);
        //System.out.println(s);

        Stack s = new Stack();
        s.push("Manthan");
        s.push("Panchal");
        s.push(45);
        s.push(true);
        s.add("Manthan2");
        System.out.println(s);
        System.out.println(s.size());
        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s);
        System.out.println(s.size());
        System.out.println(s);
        System.out.println(s.empty());
        System.out.println(s.add("Vishanu"));
        System.out.println(s);
        s.push("Chetan");
        s.add("Chandu");
        s.add(4,"Krishna");
        System.out.println(s);
        System.out.println(s.get(2));
        System.out.println(s.get(6));



    }
}