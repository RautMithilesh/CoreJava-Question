import java.util.ArrayList;

class Test {
    public static void main (String args[]) {
        ArrayList al = new ArrayList();
        al.add(0, "Sangamner");
        al.add(1, "Ahmednagar");
        al.add(2, "Maharashtra");
        al.add(3, "India");
        System.out.println(al);

        Object returnedObj = al.set(1, "nagar"); // set replaces object from that index and returns old object
        System.out.println(returnedObj);
        System.out.println(al);

        try {
            al.set(4, "Asia");  // gives exception as 4th index doesn't exist so what to replace(set) ?
        } catch (IndexOutOfBoundsException ex) {
            System.out.println(ex);
        }
        
    }
}