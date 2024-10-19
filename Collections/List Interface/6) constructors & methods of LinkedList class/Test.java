import java.util.LinkedList;

class Test {
    public static void main(String args[]) {
        LinkedList L1 = new LinkedList(); // LinkedList()
        LinkedList L2 = new LinkedList(L1);  // LinkedList(Collection c)
        
        L1.addFirst("onkar"); // public void addFirst(Object e)
        System.out.println(L1);
        L1.addFirst("mayur");
        // adds object at first node
        System.out.println(L1);

        L1.addLast("abhishek"); // public void addLast(Object e)
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