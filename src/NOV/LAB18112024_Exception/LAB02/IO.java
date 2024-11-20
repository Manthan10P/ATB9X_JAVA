package NOV.LAB18112024_Exception.LAB02;

//It is thrown when an input-output operation failed or interrupted

import java.io.IOException;
import java.util.Scanner;

public class IO {
    public static void main(String[] args) {

        Scanner scan = new Scanner("Hello Manthan");
        System.out.println("" + scan.nextLine());
        System.out.println("IO Exception" + scan.ioException());
        scan.close();

    }
}