package NOV.LAB18112024_Exception.LAB01;

//2. toString()
//The toString() method prints exception information in the
// format of the Name of the exception: description of the exception.
public class GFG1 {
    public static void main(String[] args) {
        int a = 5 ;
        int b = 0;
        try
        {
            System.out.println(a/b);
        }
        catch (ArithmeticException e)
        {
            System.out.println(e.toString());
        }
    }
}