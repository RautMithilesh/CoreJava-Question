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

        int firstFoundIndex = al.indexOf("Maharashtra");  // returns index of firstly found object
        System.out.println(firstFoundIndex);

        System.out.println(al.indexOf("Asia"));  // if object doesn't exist then it will return -1
    }
}