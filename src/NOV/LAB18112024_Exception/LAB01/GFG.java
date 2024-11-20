package NOV.LAB18112024_Exception.LAB01;

public class GFG {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try
        {
            System.out.println(a/b);
        }
        catch (ArithmeticException e )
        {
            e.printStackTrace();
        }

    }
}
//1. printStackTrace()
//This method prints exception information in the format of the
//Name of the exception: description of the exception, stack trace.