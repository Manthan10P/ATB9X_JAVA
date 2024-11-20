package NOV.LAB18112024_Exception.LAB01;

//3. getMessage()
//The getMessage() method prints only the description of the exception.
public class GFG2 {
    public static void main(String[] args) {
        int a = 5 ;
        int b = 0 ;

        try
        {
            System.out.println(a/b);
        }
        catch (ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
    }
}