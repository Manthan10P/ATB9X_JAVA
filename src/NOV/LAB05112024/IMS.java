package NOV.LAB05112024;

public class IMS {
    static String Name;
    static float salary;

    static void set(String n , float p){
        Name = n;
        salary = p;
    }

    static void get (){
        System.out.println(Name);
        System.out.println(salary);
    }
    public static void main(String[] args) {
        IMS.set("Amrit" , 10000.0f);
        IMS.get();
    }

}
