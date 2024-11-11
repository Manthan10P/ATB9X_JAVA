package NOV.LAB07112024_Inheritance;

public class student {

        String Name ;
        String Address;
        int id ;
        student(String Name , String Address ,int id ) {

            this.Name = Name;
            this.Address = Address;
            this.id = id ;
        }
    }

    class aditya{
        public static void main(String[] args) {
            student S1 = new student("Manthan" ,"Ahmedabad" , 5);
            System.out.println(S1.Address);
            System.out.println(S1.Name);
            System.out.println(S1.id);
        }

    }

