
import java.util.Vector;
import java.util.Enumeration;

class Test
{
    public static void main(String[] args) 
    {
        Vector<String> v = new Vector<String>();
        v.add("Virat");
        v.add("ABD");
        v.add("Dhoni");
        v.add("Rohit");

       Enumeration<String> e = v.elements();
        System.out.println(v);

        // public boolean hasMoreElements();

        while(e.hasMoreElements())
        {
            System.out.println(e.nextElement());      // nextElement();
        }

    }
}