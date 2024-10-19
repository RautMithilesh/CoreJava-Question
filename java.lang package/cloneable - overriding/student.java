
   // Basic Program
   
class student implements Cloneable
{
    int rollno;
    String name;

    student(int rollno , String name)
    {
        this.rollno = rollno ;
        this.name = name ;
    }

    public static void main(String[] args) throws CloneNotSupportedException
    {
        student s1= new student(10,"Onkar");
        student s2 = (student)s1.clone();
        System.out.println(s2.rollno);
        System.out.println(s2.name);
    }
}




