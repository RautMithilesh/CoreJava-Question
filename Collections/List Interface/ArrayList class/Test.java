
import java.util.ArrayList;

class Test

{
    public static void main(String[] args)
    {

        //  COLLECTION METHODS 


        // 1. add() method 
        ArrayList al = new ArrayList();
        al.add("Tushar") ;
        al.add("Kakad");
        System.out.println(al);

        
        ArrayList al2 = new ArrayList();
        al2.add("Sangamner") ;
        al2.add("Nagar");
        System.out.println(al2);

        // 2. contains method 
        System.out.println("Contains method : "+ al.contains(al2)); 

        // 3. containsAll method 
        System.out.println("Contains all method : "+ al.containsAll(al2));
     
        // 4. addAll() method 
        al.addAll(al2);
        System.out.println("addAll method : "+al);

        // 5. remove() method
        al.remove("kakad");
        System.out.println("remove method : " +al);

        // 6. removeAll() method
        al.removeAll(al2);
        System.out.println("removeAll method: "+al);

        // 7. size() method
        al.size();
        System.out.println("The size of an array is : " + al.size());

        // 8. isEmpty() method
        al.isEmpty();
        System.out.println("isEmpty method : " + al.isEmpty());

        // 9. clear() method
        al.clear();
        System.out.println("Clear method : "+al);

        // 10. retainAll() method
        al.retainAll(al2);
        System.out.println("Retain all method : " + al.retainAll(al2));

        // // 11. toArray() method 
        // Object[] obj = al.toArray();
        // System.out.println(al.toArray());



        // //  LIST INTERFACE METHODS 

        // // 1. add() method
        // ArrayList al3 = new ArrayList();
        // al3.add("Virat");
        // al3.add("Kohli");
        // System.out.println(al3);

        // ArrayList al4 = new ArrayList();
        // al4.add("Rohit");
        // al4.add("Sharma");
        // System.out.println(al4);

        // // 2. addAll() method
        // al3.addAll(al4);
        // System.out.println(al3);

        // // 3. set() method
        // Object obj2 = al3.set(1,"Dhoni");
        // System.out.println(obj+" is replaced");
        // System.out.println(al3);

        // // 4. get() method
        // Object obj3 = al3.get(3);
        // System.out.println(obj3);

        // // 5. indexOf() method 
        // int i = al3.indexOf("Dhoni");
        // System.out.println(i);

        // // 6. lastIndexOf() method
        // int i2 = al3.lastIndexOf("Dhoni");
        // System.out.println(i2);

        // // 7. remove() method
        // Object obj4 = al3.remove(2);
        // System.out.println(obj4+ " is removed");
        // System.out.println(al3);


        // //  ARRAY LIST CONSTRUCTORS

        // // Default constructor
        // ArrayList al5 = new ArrayList();

        // // Constructor with capacity
        // ArrayList al6 = new ArrayList(10);

        // //Constructor with collection
        // ArrayList al7 = new ArrayList(al5);

    }
}