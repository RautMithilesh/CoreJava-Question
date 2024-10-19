
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;

class Test
{
 public static void main(String[] args) 
 {
    Map<String,String> map = new HashMap<String,String>();

    map.put("A","Virat");   // 1.ublic object put(object key,object value);
    map.put("B","ABD");
    map.put("C","D7");
    map.put("D","Leo");
    map.put("E","CR7");
    System.out.println(map);

    Set<Map.Entry<String,String>> set = map.entrySet();

    Iterator <Map.Entry<String,String>> itr = set.iterator();

    while(itr.hasNext())
    {
        Map.Entry<String,String> entry = itr.next();
        System.out.println(entry.getKey()+ " " + entry.getValue());
    }

 }
}