import java.util.Stack;

class Test {
    public static void main(String args[]) {
        Stack s = new Stack(); // Stack()
        s.push("onkar"); // public Object push(Object item)
        s.push("abhishek");
        s.push("mayur");
        s.push("xyz");
        // push method returns pushed object
        System.out.println(s);

        System.out.println(s.pop()); // public Object pop()
        System.out.println(s);

        System.out.println(s.peek()); // public Object peek()
        // returns top object of stack, but doesn't delete it
        System.out.println(s);

        System.out.println(s.search("onkar")); // public int search(Object o)
        // it returns position(not index) from top to downwards of stack
        // here stack is as:
        // |   mayur  |
        // | abhishek |
        // |   onkar  |
        // ------------
        System.out.println(s.search("tushar"));

    }
}