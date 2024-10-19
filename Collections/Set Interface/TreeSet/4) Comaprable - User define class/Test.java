
import java.lang.Comparable;
import java.util.TreeSet;

class Employee implements Comparable <Employee>
{
    int eno;
    String ename;
    double esal;
    String eadd;

    public Employee( int eno, String ename, double esal, String eadd)
    {
        this.eno=eno;
        this.ename=ename;
        this.esal=esal;
        this.eadd=eadd;
    }

    public int compareTo(Employee e)
    {
        return new Double(this.esal).compareTo(new Double(e.esal));
    }

    public String toString()
    {
        return "Number=" +eno+ "Name=" +ename+ "Salary=" +esal+ "Address=" +eadd ;
    }
}


class Test 
{
    public static void main(String[] args) 
    {
        Employee e1 = new Employee( 1 ,  "Virat" , 50000 , "Delhi \n");
        Employee e2 = new Employee( 2 ,  "ABD" ,   20000 , "SA \n");
        Employee e3 = new Employee( 3 ,  "Dhoni" , 30000 , "Chennai \n");
        Employee e4 = new Employee( 4 ,  "Rohit" , 10000 , "Mumbai \n");

        TreeSet<Employee> ts = new TreeSet<Employee>();
        ts.add(e3);
        ts.add(e1);
        ts.add(e4);
        ts.add(e2);

        System.out.println(ts);
        

    }
}
