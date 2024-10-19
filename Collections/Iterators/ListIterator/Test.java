
import java.util.Vector;
import java.util.ListIterator;

class Test
{
    public static void main(String[] args) 
    {
        Vector<String> v = new Vector<String>();
        v.add("Virat");
        v.add("ABD");
        v.add("Dhoni");
        v.add("Rohit");

        ListIterator<String> litr = v.listIterator();
        System.out.println(v);

        // Forward Direction 

        System.out.println("Elements in Forward Direction are : ");

        while(litr.hasNext())                // hasNext() method 
        {
            System.out.println(litr.next());          // next() method
        }

       
        // Backward Direction 

        System.out.println("Elements in Backward Direction are : ");

        while(litr.hasPrevious())     // hasPrevious() method 
        {
            System.out.println(litr.previous());    // previous() method
        }

    
        // public object add(object obj);
        System.out.println("Element added : " +v.add("Bumrah"));
        System.out.println("Bumrah added");

        // Public void remove(object obj);
        System.out.println("Element removed : " +v.remove("Rohit"));
        System.out.println("Rohit is removed");

    }
}