import java.util.ArrayList;

class Test {
    public static void main (String args[]){
        ArrayList al1 = new ArrayList();
        al1.add("onkar");
        al1.add("abhishek");
        al1.add("mayur");
        System.out.println(al1); // [onkar, abhishek, mayur]

        System.out.println(al1.isEmpty());

        ArrayList al2 = new ArrayList();
        System.out.println(al2.isEmpty());
    }
}