
import java.util.Vector;
import java.util.Iterator;

class Test
{
    public static void main(String[] args) 
    {
        Vector<String> v = new Vector<String>();
        v.add("Virat");
        v.add("ABD");
        v.add("Dhoni");
        v.add("Rohit");

        Iterator<String> itr = v.iterator();
        System.out.println(v);

        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

        // public object add(object obj);
        System.out.println("Element added : " +v.add("Bumrah"));
        System.out.println("Bumrah added");

        // public void remove(object obj);
        System.out.println("Element removed : " +v.remove("Rohit"));
        System.out.println("Rohit removed");
                

    }
}