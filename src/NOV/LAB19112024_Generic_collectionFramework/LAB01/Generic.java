package NOV.LAB19112024_Generic_collectionFramework.LAB01;

public class Generic {
    public static void main(String[] args) {
        temp_sum(25,56);
        temp_sum("Manthan" , "Panchal");
        temp_sum(true , false);
        // all datatypes

    }
    public static <Manthan> Manthan temp_sum (Manthan a , Manthan b){
        System.out.println(a);
        System.out.println(b);
        return null;
    }
}