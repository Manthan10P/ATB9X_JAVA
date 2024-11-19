package NOV.LAB12112024_Abstraction.LAB_2;
//abstract class
abstract class car_5
{
    //child abstract class method1
    public abstract void drive();
    //child abstract class method2
    public abstract void fly();
    // normal class
    public void playmusic() {
        System.out.println("play music");
    }

    //create method inherited class of car
    // we have to compulsary create the method for abstract class
    static class WagonR extends car_5 {
        public void fly() {
            System.out.println("Fly");
        }

        public void drive() {
            System.out.println("Driving");
        }
    }
}

    public class Demo
    {
        public static void main(String[] args)
        {
            // creating the object
            car_5 obj = new car_5.WagonR();
            obj.drive();
            obj.playmusic();
            obj.fly();
        }
    }
