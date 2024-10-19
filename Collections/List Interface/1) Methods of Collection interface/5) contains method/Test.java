import java.util.ArrayList;

class Test {
    public static void main (String args[]){
        ArrayList al = new ArrayList();
        al.add("onkar");
        al.add("abhishek");
        al.add("mayur");
        System.out.println(al);

        Boolean isTushar = al.contains("tushar");
        Boolean isMayur = al.contains("mayur");
        System.out.println(isTushar);
        System.out.println(isMayur);
    }
}