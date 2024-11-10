package NOV.LAB05112024;


    public class Dog_info {
        String Name ;
        String Breed ;
        String Color ;
        int Age ;

        Dog_info(String Name , String Breed , String Color , int Age ){
            this.Name = Name;
            this.Breed = Breed;
            this.Color = Color;
            this.Age = Age;
        }
    }
    class Dog_data {
        public static void main(String[] args) {
            Dog_info D1 = new Dog_info("Pluto", "Capri", "black", 45);
            System.out.println(D1.Name);
            System.out.println(D1.Breed);
            System.out.println(D1.Color);
            System.out.println(D1.Age);

        };
    }

