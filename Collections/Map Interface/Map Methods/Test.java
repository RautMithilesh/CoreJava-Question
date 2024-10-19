
import java.util.HashMap;

class Test
{
 public static void main(String[] args) 
 {

// METHODS 

    HashMap<Integer,String> hm = new HashMap<Integer,String>();

    hm.put(1,"Virat");   // 1.ublic object put(object key,object value);
    hm.put(2,"ABD");
    hm.put(3,"D7");
    hm.put(4,"Leo");
    hm.put(5,"CR7");
    System.out.println(hm);

    // 2. public object get(object key);
    System.out.println(hm.get(1));
    
    // 3. public object remove(object key);
    System.out.println(hm.remove(3));

    // 4. public int size();
    System.out.println(hm.size());

    // 5. public boolean isEmpty();
    System.out.println(hm.isEmpty());

    // 6. public boolean containsKey(object key);
    System.out.println(hm.containsKey(4));
    
    // 7. public boolean containsValue(object value);
    System.out.println(hm.containsValue("Virat"));

    // 8. public set keySet();
    System.out.println(hm.keySet());

    // 9. public collection values();
    System.out.println(hm.values());

    // 10. public void clear();
    hm.clear();
    System.out.println(hm);


// CONSTRUCTORS

   // 1. Default Constructor 
   HashMap<String,String> hm1 = new HashMap<String,String>();
   hm1.put("A","Virat");   // 1.public object put(object key,object value);
   hm1.put("B","ABD");
   hm1.put("C","D7");
   hm1.put("D","Leo");
   hm1.put("E","CR7");

   //HashMap(int initialCapacity)
   HashMap<String,String> hm2 = new HashMap<String,String>(16);    
   hm2.putAll(hm1);
   System.out.println(hm2);
   System.out.println(hm2.size()); 

   //HashMap(int initialCapacity, float load factor)
   HashMap<String,String> hm3 = new HashMap<String,String>(16,75); 
   hm3.putAll(hm1);
   System.out.println(hm3);
   System.out.println("Incremental capacity is: " + hm3.size());
    
   //HashMap(Map hm)
   HashMap<String,String> hm4 = new HashMap<String,String>(hm1);  
   System.out.println(hm4);

 }
}


