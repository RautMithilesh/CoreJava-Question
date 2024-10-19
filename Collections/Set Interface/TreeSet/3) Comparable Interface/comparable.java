import java.util.Comparator;
import java.util.TreeSet;
  
class Student 
{
    String name;
    int marks;
  
    public Student(String name,int marks)
    {
        this.name = name;
        this.marks = marks;
    }
  
    public String getName() 
    { 
        return name; 
    }
 
    public void setName(String name) 
    { 
        this.name = name; 
    }
  
    public int getMarks() 
    { 
        return marks; 
    }

    public void setMarks(int marks) 
    { 
        this.marks = marks; 
    }
  
 
    public String toString()
    {
        return ("student name =" + name + "  " + "  marks=" + marks);
    }

}
  
class nameCompare implements Comparator<Student> 
{
    public int compare(Student s1,Student s2)
    {
        return s1.getName().compareTo(s2.getName());
    }
}
  
class marksCompare implements Comparator<Student> 
{
    public int compare(Student f1, Student f2)
    {
        if(f1.getMarks() > f2.getMarks()) 
        {
            return 1;
        }
        else if(f1.getMarks() < f2.getMarks())
        {
            return -1;
        }
        else 
        {
            return 0;
        }
    }
}
  



public class comparable
{
  
    public static void main(String[] args)
    {
  
        TreeSet<Student> treeSet= new TreeSet<>(new marksCompare());
  
        treeSet.add(new Student("pk", 99));
        treeSet.add(new Student("Yash", 95));
        treeSet.add(new Student("Rupesh", 92));
        treeSet.add(new Student("Shivam", 47));
        treeSet.add(new Student("Sarthak", 78));
        treeSet.add(new Student("gk", 67));
        treeSet.add(new Student("pratik", 57));
  
        System.out.println("Sorting on the basis of marks");
  
        for (Student tree : treeSet)
        {
            System.out.println(tree);
        }

     
    }
}