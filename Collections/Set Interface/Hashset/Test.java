import java.util.HashSet;

class Test 
{
    public static void main (String args[])
    {

// HASHSET CONSTRUCTORS

        HashSet<String> hs1 = new HashSet<String>();  //HashSet()
        hs1.add("Virat");
        hs1.add("ABD");
        hs1.add("Dhoni");
        System.out.println(hs1);

        //HashSet(Collection c)
        HashSet<String> hs2 = new HashSet<String>(hs1);  
        System.out.println(hs2);

        //HashSet(int initialCapacity)
        HashSet<String> hs3 = new HashSet<String>(16);    
        hs3.addAll(hs1);
        System.out.println(hs3);
        System.out.println(hs3.size()); 

        //HashSet(int initialCapacity, float load factor)
        HashSet<String> hs4 = new HashSet<String>(16,75); 
        hs4.addAll(hs1);
        System.out.println(hs4);
        System.out.println("Incremental capacity is: " + hs4.size());


// COLLECTION METHODS

        // 1. add() method 
        HashSet <String> hs5 = new HashSet<String>();
        hs5.add("Tushar") ;
        hs5.add("Kakad");
        System.out.println(hs5);

        
        HashSet<String> hs6 = new HashSet<String>();
        hs6.add("Sangamner") ;
        hs6.add("Nagar");
        System.out.println(hs6);

        // 2. contains method 
        System.out.println("Contains method : "+ hs5.contains(hs6)); 

        // 3. containsAll method 
        System.out.println("Contains all method : "+ hs5.containsAll(hs6));
     
        // 4. addAll() method 
        hs5.addAll(hs6);
        System.out.println("addAll method : "+hs5);

        // 5. remove() method
        hs5.remove("kakad");
        System.out.println("remove method : " +hs5);

        // 6. removeAll() method
        hs5.removeAll(hs6);
        System.out.println("removeAll method: "+hs5);

        // 7. size() method
        hs5.size();
        System.out.println("The size of an array is : " + hs5.size());

        // 8. isEmpty() method
        hs5.isEmpty();
        System.out.println("isEmpty method : " + hs5.isEmpty());

        // 9. clear() method
        hs5.clear();
        System.out.println("Clear method : "+hs5);

        // 10. retainAll() method
        hs5.retainAll(hs6);
        System.out.println("Retain all method : " + hs5.retainAll(hs6));

        // 11. toArray() method 
        Object[] obj = hs5.toArray();
        System.out.println(hs6.toArray());

        
    }
}