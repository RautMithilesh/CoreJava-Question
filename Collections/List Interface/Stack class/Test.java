import java.util.Stack;

class Test 
{
    public static void main(String args[])
     {
        Stack<String> s = new Stack<String>(); // Stack()
        s.push("Virat"); // public Object push(Object item)
        s.push("ABD");
        s.push("Dhoni");
        s.push("Rohit");
        // push method returns pushed object
        System.out.println(s);

        System.out.println(s.pop()); // public Object pop()
        System.out.println(s);

        System.out.println(s.peek()); // public Object peek()
        // returns top object of stack, but doesn't delete it
        System.out.println(s);

    }
}