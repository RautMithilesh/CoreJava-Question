import java.util.ArrayList;

class Test {
    public static void main (String args[]){
        ArrayList al1 = new ArrayList();
        al1.add("onkar");
        al1.add("abhishek");
        al1.add("mayur");
        System.out.println(al1);  // [onkar, abhishek, mayur]

        ArrayList al2 = new ArrayList();
        al2.add("onkar");
        al2.add("abhishek");
        al2.add("xyz");
        System.out.println(al2);  // [onkar, abhishek, xyz]

        ArrayList al3 = new ArrayList();
        al3.add("onkar");
        al3.add("abhishek");
        al3.add("mayur");
        System.out.println(al3);  // [onkar, abhishek, mayur]

        System.out.println(al1.containsAll(al2));
        System.out.println(al1.containsAll(al3));
    }
}