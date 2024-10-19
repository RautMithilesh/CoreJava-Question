import java.util.ArrayList;
import java.util.SortedSet;

class Test {
    public static void main (String args[]){
        ArrayList al1 = new ArrayList();
        al1.add(40);
        al1.add(30);
        al1.add(20);
        al1.add(10);
        System.out.println(al1);

        ArrayList al2 = new ArrayList();
        al2.add(al1);
        System.out.println(al2);
    }
}