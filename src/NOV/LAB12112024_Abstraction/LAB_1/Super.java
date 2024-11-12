package NOV.LAB12112024_Abstraction.LAB_1;
    import java.lang.invoke.VarHandle;

    public class Super {
        public static void main(String[] args) {
            Car c = new Car();
        }
    }
    class Car extends Vehicle{
        private int maxSpeed = 281 ;
        @Override
        void display (){
            System.out.println("Child");
        }
        Car(){
            super(10);
            System.out.println("DC Car");
            System.out.println(this.maxSpeed);
            System.out.println(super.maxSpeed);
            this.display();
            super.display();
        }
    }

    class Vehicle {
        public int maxSpeed = 180;
        void display(){
            System.out.println("Parent");
        }
        Vehicle(){
            System.out.println("Dc Vehicle");
        }
        Vehicle(int a ){
            System.out.println("PC Vehicle");
        }
        void message(){
            System.out.println("Hello Vehicle");
        }
        void message(int a){
            System.out.println("Hello Vehicle");
        }
    }

