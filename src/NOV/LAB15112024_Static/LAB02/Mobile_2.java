package NOV.LAB15112024_Static.LAB02;

// static block
public class Mobile_2 {
    // instance variable
    String brand;
    int Price;
    static String Network;
    String name;

    // constructor
    public void mobile (){
        brand = "";
        Price = 17900;
        System.out.println("In Constructor");
    }

    // static
    {
        Network = "Airtel";
        System.out.println("In Static block");
    }

    public void show()
    {
        System.out.println(brand +" "+ Price +" "+ Network +" "+ name);
    }

}
class Mobile_info2
{
    public static void main(String[] args) {
        Mobile_2 obj1 = new Mobile_2();
        obj1.brand = "Apple";
        obj1.Price = 70000;
        Mobile_2.Network = "JIO";
        obj1.name = "Smart";

        Mobile_2 obj2 = new Mobile_2();

        obj1.show();
    }
}
