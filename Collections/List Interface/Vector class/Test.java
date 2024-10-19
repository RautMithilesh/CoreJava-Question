
import java.util.Vector;

class Test

{
    public static void main(String[] args)
    {


 // VECTOR CLASS METHODS 

 
         Vector<String> v = new Vector<String>(); // Vector()
         v.add("Virat");
         v.add("ABD");
         v.add("Dhoni");
         v.add("Rohit");
         System.out.println(v);
 
          // public Object firstElement()
         System.out.println(v.firstElement());
         
         // public Object lastElement()
         System.out.println(v.lastElement()); 

         // public Object elementAt(int index)
         System.out.println(v.elementAt(1));

         // public boolean removeElement(Object obj)
         System.out.println(v.removeElement("Rohit")); 
         System.out.println(v);
 
         // public void removeElementAt(int index)
         v.removeElementAt(2); 
         // if index not exist then gives Exception
         System.out.println(v);
 
         // public void removeAllElements()
         v.removeAllElements(); 
         System.out.println(v);
  

 // VECTOR CONSTRUCTORS


        // 1. Default constructor with initial capacity 10
        Vector<String>v5 = new Vector<String>();

        // 2. Initial capacity 10 & increment it by 2 (formula = current_capacity*2)
        Vector<String> v6 = new Vector<String>(10);

        // 3. Initial capacity is given and we can increment it 
        Vector<String> v7 = new Vector<String>(10,50);

        // 4. Contains all elements of collection
        Vector<String> v8 = new Vector<String>(v7);


    }

}
