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

        int lastFoundIndex = al.lastIndexOf("Maharashtra");  // returns index of lastly found object
        System.out.println(lastFoundIndex);

        System.out.println(al.lastIndexOf("Asia")); // if object doesn't exist then it will return -1
    }
}