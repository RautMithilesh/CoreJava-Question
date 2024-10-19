class Student implements Cloneable {
    int rollno;
    String name;

    Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    public static void main (String args[]) throws CloneNotSupportedException {
        Student s1 = new Student(10, "Abhishek");
        Student s2 = (Student) s1.clone();
        System.out.println(s2.rollno);
        System.out.println(s2.name);
    }
}