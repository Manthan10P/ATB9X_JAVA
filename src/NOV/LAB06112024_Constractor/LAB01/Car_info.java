package NOV.LAB06112024_Constractor.LAB01;

public class Car_info {
    String Name;
    String Color;
    String Company;
    int Car_number;

    Car_info(String Name , String Color , String Company , int Car_number ){
        this.Name = Name ;
        this.Color = Color;
        this.Company = Company;
        this.Car_number = Car_number;
    }
}
class car_data {
    public static void main(String[] args) {
        Car_info C1 = new Car_info("Curve","Black","TATA",4567);
        System.out.println(C1.Name);
        System.out.println(C1.Color);
        System.out.println(C1.Company);
        System.out.println(C1.Car_number);
        System.out.println("My car name is " + C1.Name +" "+ "It's " +C1.Color +" "+ "color " +" "+ "Company is "+ C1.Company +" "+ "Car Number is " +" "+ C1.Car_number);
    }

}
