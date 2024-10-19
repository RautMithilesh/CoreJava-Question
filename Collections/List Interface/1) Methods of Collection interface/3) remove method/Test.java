import java.util.ArrayList;

class Test {
    public static void main (String args[]){
        ArrayList al = new ArrayList();
        al.add("onkar");
        al.add("mayur");
        al.add("abhishek");
        al.add(40); 
        System.out.println(al);

        al.remove("onkar"); // remove(object to be removed);
        al.remove("mayur");
        al.remove(new Integer(40));
        System.out.println(al);
    }
}