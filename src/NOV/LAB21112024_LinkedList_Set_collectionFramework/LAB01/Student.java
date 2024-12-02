package NOV.LAB21112024_LinkedList_Set_collectionFramework.LAB01;

public class Student {
    private String name ;
    private String rollno ;

    public Student(String name , String rollno){
        this.name=name;
        this.rollno=rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollno() {
        return rollno;
    }

    public void setRollno(String rollno) {
        this.rollno = rollno;
    }

    public void printdetails (){
        System.out.println(name);
        System.out.println(rollno);
    }
}