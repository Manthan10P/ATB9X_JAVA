package NOV.LAB18112024_Exception.LAB02;

//NumberFormatException: This exception is raised when a method could not convert a string into a numeric format.

public class NumberFormat {
    public static void main(String[] args) {
        try{
            int num = Integer.parseInt("Akki is not int");
        }
        catch (NumberFormatException e ){
            System.out.println("NUmber format exception");
        }

    }
}