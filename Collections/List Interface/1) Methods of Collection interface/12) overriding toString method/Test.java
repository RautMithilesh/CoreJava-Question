import java.util.ArrayList;
class Student{
    int rollno;
    int prn;
    String name;
    static String clgname = "AVCOE";
    Student(int rollno , int prn , String name){
        this.rollno=rollno;
        this.prn=prn;
        this.name=name;
    }
    public String toString(){
        return(clgname+" "+rollno+" "+prn+" "+name+" ");
    }
}

class Test {
public static void main (String args[]){
        Student Mayur = new Student(1,10,"Mayur");
        // System.out.println(Mayur.clgname+" "+Mayur.name+" "+Mayur.prn+" "+Mayur.rollno);
        Student Onkar = new Student(2,20,"Onkar");
        Student Abhishek = new Student(3,30,"Abhishek");

        ArrayList stds=new ArrayList();
        stds.add(Mayur);
        stds.add(Onkar);
        stds.add(Abhishek);
        System.out.println(stds);
    }
}