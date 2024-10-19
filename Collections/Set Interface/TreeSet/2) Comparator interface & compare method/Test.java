import java.util.ArrayList;
import java.util.LinkedList;

public class Test {

    public static void main(String[] args) {

        // Create a linked list
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("apple");
        linkedList.add("banana");
        linkedList.add("cherry");
        linkedList.add("date");

        // Convert linked list to array list
        ArrayList<String> arrayList = new ArrayList<>(linkedList);

        // Print the array list
        System.out.println(arrayList);
    }
}