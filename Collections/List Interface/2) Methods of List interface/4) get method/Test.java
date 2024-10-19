import java.util.ArrayList;

class Test {
    public static void main (String args[]) {
        ArrayList al = new ArrayList();
        al.add(0, "Sangamner");
        al.add(1, "Ahmednagar");
        al.add(2, "Maharashtra");
        al.add(3, "India");
        System.out.println(al);

        Object obj1 = al.get(2);  // returns object from given index
        System.out.println(obj1);

        try {
            System.out.println(al.get(7));  // gives exceptions as 7th index doesn't exist
        } catch (IndexOutOfBoundsException ex) {
            System.out.println(ex);
        }
    }
}