import java.util.ArrayList;

class Test {
    public static void main (String args[]) {
        ArrayList al = new ArrayList();
        al.add(0, "Sangamner");
        al.add(1, "Ahmednagar");
        al.add(2, "Maharashtra");
        al.add(3, "Maharashtra");
        al.add(4, "India");
        System.out.println(al);

        Object removedObject = al.remove(3); // removes object of given index & returns removed object
        System.out.println(removedObject);
        System.out.println(al);

        try {
            al.remove(10); // gives exception as 10th index doesn't exit so what to remove ?
        } catch (IndexOutOfBoundsException ex) {
            System.out.println(ex);
        }
    }
}