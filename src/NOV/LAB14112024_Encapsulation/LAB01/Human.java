package NOV.LAB14112024_Encapsulation.LAB01;

import javax.lang.model.element.Name;

// not share every details
public class Human
{
    //keep private
    private int age = 11 ;
    private String name = "Navin";

    //for access you have to create methods and call it
    public int getAge()
    {
        return age;
    }
    //public int setAge(int a)
    //{
      //  age = a;
       // return a;
    //}
    public String getName() {
        return name;
    }
    //public String setName(String ar) {
      //  String Name = ar;
        //return ar;
    //}
}
    class demo
    {
        public static void main(String[] args)
    {
        Human obj = new Human();
        //obj.setAge(56);
        //String s = obj.setName("Manthan");;
        //call the created Encapsulation method
    System.out.println(obj.getAge());
    System.out.println(obj.getName());
    }

}