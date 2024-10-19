import java.util.Vector;

class Test 
{
    public static void main(String args[]) 
    {
        Vector v = new Vector(); // Vector()
        v.add("onkar");
        v.add("abhishek");
        v.add("mayur");
        v.add("xyz");
        System.out.println(v);

        System.out.println(v.firstElement()); // public Object firstElement()
        
        System.out.println(v.lastElement()); // public Object lastElement()

        System.out.println(v.elementAt(1)); // public Object elementAt(int index)
        
        System.out.println(v.removeElement("xyz")); // public boolean removeElement(Object obj)
        System.out.println(v);

        v.removeElementAt(2); // public void removeElementAt(int index)
        // if index not exist then gives Exception
        System.out.println(v);

        v.removeAllElements(); // public void removeAllElements()
        System.out.println(v);
    }
}