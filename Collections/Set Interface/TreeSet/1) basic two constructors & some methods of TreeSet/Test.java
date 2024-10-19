import java.util.ArrayList;
import java.util.NavigableSet;
import java.util.TreeSet;

class Test 
{
    public static void main (String args[])
    {
        ArrayList al = new ArrayList();
        al.add(30);
        al.add(20);
        al.add(10);
        System.out.println(al);
        TreeSet ts2 = new TreeSet(al);
        System.out.println(ts2);
        System.out.println();

        TreeSet ts1 = new TreeSet(); // TreeSet()
        ts1.add(8);
        ts1.add(2);
        ts1.add(13);
        ts1.add(12);
        ts1.add(1);
        // ts1.add("onkar");  heterogenous element is not allowed

        NavigableSet ns = ts1.descendingSet(); // public NavigableSet descendingSet()
        System.out.println(ns); 
        
        // descendingSet returns object in descending order, that's why NavigableSet(I) is introduced
        System.out.println(ns.first());
        System.out.println(ns.last());
        System.out.println(ns.headSet(12)); // public SortedSet headSet(Object toElement)
        // returns SortedSet before that given object, excluding given object
        System.out.println(ns.tailSet(2));  // public SortedSet tailSet(Object fromElement)
        // returns SortedSet after that given object including given object
        System.out.println();

        System.out.println(ts1); // we will get a ascending sorted values
        System.out.println(ts1.first());
        System.out.println(ts1.last());
        System.out.println(ts1.headSet(12)); // public SortedSet headSet(Object toElement)
        // returns SortedSet before that given object, excluding given object
        System.out.println(ts1.tailSet(2));  // public SortedSet tailSet(Object fromElement)
        // returns SortedSet after that given object including given object

       
       

    }
}