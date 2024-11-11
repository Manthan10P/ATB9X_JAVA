package NOV.LAB07112024_Inheritance;
import java.util.Scanner;
public class School_info {

        String Name ;
        String Address;
        int id ;
        School_info(String Name , String Address ,int id ) {

            this.Name = Name;
            this.Address = Address;
            this.id = id ;
        }
    }

    class data{
        public static void main(String[] args) {
            //student S1 = new student("Manthan" ,"Ahmedabad" , 5);

            Scanner S2 = new Scanner(System.in);
            System.out.println("Enter the String Name : ");
            String Firstname = S2.next();

            Scanner S3 = new Scanner(System.in);
            System.out.println("Enter the Address : ");
            String address = S3.next();

            Scanner S4 = new Scanner(System.in);
            System.out.println("Enter the id : ");
            int id = S4.nextInt();

            //System.out.println(S1.Address);
            //System.out.println(S1.Name);
            //System.out.println(S1.id);


        }

    }


