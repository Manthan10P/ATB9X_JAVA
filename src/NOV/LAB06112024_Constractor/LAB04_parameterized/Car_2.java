package NOV.LAB06112024_Constractor.LAB04_parameterized;
    import java.util.Scanner;

    public class Car_2
    {
        public static void main(String[] args)
        {
            Scanner sc  = new Scanner(System.in);
            car3 t1 = new car3("tesla");
            System.out.println(t1.model);
            System.out.println(t1.year);

            //t1.display();

            car3 t2 = new car3("neno",2013);
            System.out.println(t2.model);
            System.out.println(t2.year);

            //t2.display();
        }
    }
    class car3
    {
        String model;
        int year;

        car3()
        {
            model = "D Model";
            year = 1990;
        }
        // parameterized constructor 1
        car3(String model,int year)
        {
            System.out.println("PC1");
            this.model=model;
            this.year=year;
        }
        //parameterized constructor 2
        car3(String model)
        {
            System.out.println("PC2");
            this.model=model;
        }

        void display ()
        {
            System.out.println("car details" + this.model + " " +this.year);
        }

    }

