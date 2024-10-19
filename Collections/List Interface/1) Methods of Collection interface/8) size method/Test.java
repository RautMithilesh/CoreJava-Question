import java.util.ArrayList;

class Test {
    public static void main (String args[]){
        ArrayList al = new ArrayList();
        al.add("onkar");
        al.add("abhishek");
        al.add("mayur");
        System.out.println(al);  // [onkar, abhishek, mayur]

        int count = al.size();
        System.out.println(count);
    }
}