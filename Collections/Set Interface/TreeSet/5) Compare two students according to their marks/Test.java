
import java.lang.Comparable;
import java.util.TreeSet;



class Student implements Comparable<Student>
{
    
    String ename;
    float marks ;
   

    public Student( String ename, float marks)
    {
       
        this.ename=ename;
        this.marks=marks;
    }

    public int compareTo(Student s)
    {
        return new Double(this.marks).compareTo(new Double(s.marks));
    }

    public String toString()
    {
        return  "Name=" +ename+ "Marks=" +marks ;
    }
}


class Test 
{
    public static void main(String[] args) 
    {
        Student s1 = new Student( " Virat", 90);
        Student s2 = new Student( " ABD", 95 );
        Student s3 = new Student( " Dhoni",  85 );
        Student s4 = new Student( " Rohit" ,  80 );

        TreeSet<Student> ts = new TreeSet<Student>();
        ts.add(s3);
        ts.add(s1);
        ts.add(s4);
        ts.add(s2);

        System.out.println("Student according to their marks");
        System.out.println(ts);
        

    }
}
