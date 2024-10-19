import java.util.ArrayList;

class Test {
    public static void main (String args[]) {
        ArrayList al = new ArrayList();
        System.out.println(al);  // []
        al.add(0, "onkar");
        System.out.println(al); // [onkar]
        
        try {
            al.add(2, "abhishek"); // it will give Exception
        } catch (IndexOutOfBoundsException ex) {
            System.out.println(ex);
        }
        System.out.println(al); // [onkar]
        
        al.add(1, "abhishek");
        System.out.println(al);  // [onkar, abhishek]

        al.add(1, "mayur");      // it will shift all objects to right from index 1
        System.out.println(al);  // [onkar, mayur, abhishek]
    }
}