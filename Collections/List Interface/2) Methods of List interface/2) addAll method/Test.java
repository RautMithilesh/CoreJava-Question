import java.util.ArrayList;

class Test {
    public static void main (String args[]) {
        ArrayList al1 = new ArrayList();
        al1.add(0, "onkar");
        al1.add(1, "abhishek");
        al1.add(2, "mayur");
        System.out.println(al1); 
        
        ArrayList al2 = new ArrayList();
        al2.add(0, "abc");
        al2.add(1, "pqr");
        al2.add(2, "xyz");
        System.out.println(al2);

        al1.addAll(0, al2);     // all elements from index 0 of al1 will shift to right
        System.out.println(al1);
    }
}