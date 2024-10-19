class Address implements Cloneable {
    String add;
    Address(String add) {
        this.add = add;
    }
}
class Student implements Cloneable {
    int rollno;
    String name;
    Address addptr;

    Student(int rollno, String name, String add) {
        this.rollno = rollno;
        this.name = name;
        this.addptr = new Address(add);
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    public static void main (String args[]) throws CloneNotSupportedException {
        Student s1 = new Student(10, "Abhishek", "Jorve");
        Student s2 = (Student) s1.clone();
        System.out.println(s2.rollno);
        System.out.println(s2.name);
        System.out.println(s2.addptr.add);
        
        System.out.println(s1.addptr);
        System.out.println(s2.addptr);
        System.out.println(s1.addptr.equals(s2.addptr));
        /* so this three lines show that there is shallow copy as data member "addptr" of
           both objects s1 and s2 is pointing to same memory */
    }
}