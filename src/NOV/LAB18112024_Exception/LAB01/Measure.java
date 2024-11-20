package NOV.LAB18112024_Exception.LAB01;
public class Measure {
    static void Checkage(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access denied");
            //System.out.println("Access Denied");
        } else {
            System.out.println("Access granted");
        }

    }

    public static void main(String[] args) {
        Measure.Checkage(17);
    }
}