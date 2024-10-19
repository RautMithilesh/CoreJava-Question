import java.util.ArrayList;

class Test {
    public static void main (String args[]){
        ArrayList al = new ArrayList();
        al.add("onkar");
        al.add("abhishek");
        al.add("mayur");
        System.out.println(al); // [onkar, abhishek, mayur]

        // toArray returns an array containing all of the elements in this list "al" in proper sequence
        Object[] obj = al.toArray();
        for (int i = 0; i < obj.length; i++) {
            System.out.println(obj[i]);
        }

        System.out.println();
        // lets print same but with advanced for loop
        // advanced for loop is mainly used for printing objects
        for (Object ob : obj) {
            System.out.println(ob);
        }
    }
}