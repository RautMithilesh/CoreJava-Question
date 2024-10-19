import java.util.ArrayList;

class Test {
    public static void main (String args[]){
        ArrayList al1 = new ArrayList();   // ArrayList()
        al1.add("onkar");
        al1.add("mayur");
        al1.add("abhishek");
        System.out.println(al1);

        ArrayList al2 = new ArrayList(al1); // ArrayList(Collection c)
        System.out.println(al2);

        ArrayList al3 = new ArrayList(5); // ArrayList(int initialCapacity)
        System.out.println(al3);
    }
}