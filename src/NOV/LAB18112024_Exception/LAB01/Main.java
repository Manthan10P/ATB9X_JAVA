package NOV.LAB18112024_Exception.LAB01;

public class Main {
    public static void main(String[] args)
    {
        try
        {
            int[] mynumber = {2,3,4};
            System.out.println(mynumber[10]);
        }
        catch (Exception e)
        {
            System.out.println("Something is wrong");
        }
        finally {
            System.out.println("Try and catch completed");
        }
    }
}
