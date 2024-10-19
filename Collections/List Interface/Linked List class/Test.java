import java.util.LinkedList;

class Test
 {
    public static void main(String args[])
     {
        // CONSTRUCTORS

        LinkedList<String> L1 = new LinkedList<String>(); // LinkedList()
        LinkedList<String> L2 = new LinkedList<String>(L1);  // LinkedList(Collection c)
        
        // METHODS
        
        L1.addFirst("Virat"); // public void addFirst(Object e)
        System.out.println(L1);
        L1.addFirst("ABD");
        // adds object at first node
        System.out.println(L1);

        L1.addLast("DHONI"); // public void addLast(Object e)
        // adds object at last node
        System.out.println(L1);

        System.out.println(L1.getFirst()); // public Object getFirst()
        // returns object of first node 

        System.out.println(L1.getLast()); // public Object getLast()       
        // returns object of last node 
        System.out.println(L1);

        System.out.println(L1.removeFirst()); // public Object removeFirst()
        // removes & returns object of first node 
        System.out.println(L1);

        System.out.println(L1.removeLast()); // public Object removeLast()
        // removes & returns object of Last node 
        System.out.println(L1);
    }
}