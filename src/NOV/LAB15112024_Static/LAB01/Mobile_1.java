package NOV.LAB15112024_Static.LAB01;

import javax.xml.namespace.QName;

    public class Mobile_1
    {
        // instance variable
        String brand;
        int Price;
        static String Network;
        String name;

        public void show()
        {
            System.out.println(brand +" "+ Price +" "+ Network +" "+ name);
        }
        // use this obj for static method access indirect
        public static void show1(Mobile_1 obj)
        {
            System.out.println("This is static method & we use static variable in static method");
            System.out.println(Mobile_1.Network);
        // for indirect access for static method
            System.out.println(obj.brand +" "+ obj.Price +" "+ Network +" "+ obj.name);
        }
    }
    class Mobile_info_1
    {
        public static void main(String[] args) {
            Mobile_1 obj1 = new Mobile_1();
            obj1.brand = "Apple";
            obj1.Price = 70000;
            Mobile_1.Network = "JIO"; //static override
            obj1.name = "Smart";

            Mobile_1 obj2 = new Mobile_1();
            obj2.brand = "samsung";
            obj2.Price = 45000;
            Mobile_1.Network = "Airtel";
            obj2.name = "Smart_folded";

            //obj1.show();  // static variable
            //obj2.show();  // static variable

            Mobile_1.show1(obj1);
            Mobile_1.show1(obj2);
    }
}

