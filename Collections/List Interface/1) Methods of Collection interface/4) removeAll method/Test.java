import java.util.ArrayList;

class Test {
    public static void main (String args[]){
        ArrayList al1 = new ArrayList();
        al1.add(10);
        al1.add(20);
        al1.add(30);
        al1.add(40); 
        System.out.println(al1);    // [10, 20, 30, 40]

        ArrayList al2 = new ArrayList();
        al2.add(10);
        al2.add(20);
        al2.add(40);
        System.out.println(al2);   // [10, 20, 40]

        al1.removeAll(al2);
        System.out.println(al1);   // [30]
    }
}