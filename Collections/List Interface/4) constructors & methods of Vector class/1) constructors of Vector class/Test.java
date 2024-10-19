import java.util.Vector;

class Test {
    public static void main (String args[]){
        Vector v1 = new Vector();  // Vector()
        v1.add("onkar");
        v1.add("abhishek");
        v1.add("mayur");
        System.out.println(v1);

        Vector v2 = new Vector(v1);  // Vector(Collection c)
        System.out.println(v2);

        Vector v3 = new Vector(6); // Vector(int initialCapacity)   
        v3.addAll(v1);
        System.out.println(v3);
        System.out.println(v3.capacity()); 
        
        Vector v4 = new Vector(4, 10); // Vector(int initialCapacity, int capacityIncrement)
        v4.addAll(v1);
        System.out.println(v4);
        System.out.println("initial capacity is: " + v4.capacity());
        // now add two more objects so v4 will overflow and size of vector will increase by capacityIncrement
        v4.add("abc");
        System.out.println("now capacity is: " + v4.capacity());
        v4.add("xyz");
        // now capacity is incresed by capacityIncrement
        System.out.println("now capacity is: " + v4.capacity());
        // so after overflow, totalCapacity = initialCapacity + capacityIncrement = 4 + 10 = 14
    }
}