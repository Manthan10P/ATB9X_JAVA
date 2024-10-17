package OCT.LAB017102024;
import java.util.Scanner;

public class LAB_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number 1 : ");
        int N = sc.nextInt();
        System.out.println("Enter the Number 2 : ");
        int M = sc.nextInt();

        if (M>=N) {
            System.out.println("M is the Largest number ");
        }
        else {
            System.out.println("N is the Largest number ");
        }
    }
}
