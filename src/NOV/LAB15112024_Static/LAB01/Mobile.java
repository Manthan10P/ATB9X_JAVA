package NOV.LAB15112024_Static.LAB01;

// static variable is call also with its class name
    public class Mobile {
        // instance variable
        String brand;
        int Price;
        static String Network;
        String name;

        public void show()
        {
            System.out.println(brand +" "+ Price +" "+ Network +" "+ name);
        }

    }
        class Mobile_info
        {
            public static void main(String[] args) {
             Mobile obj1 = new Mobile();
             obj1.brand = "Apple";
             obj1.Price = 70000;
             Mobile.Network = "JIO";
             obj1.name = "Smart";

             Mobile obj2 = new Mobile();
             obj2.brand = "samsung";
             obj2.Price = 45000;
             Mobile.Network = "Airtel";
             obj2.name = "Smart_folded";

             obj1.show();
             obj2.show();
         }
     }
