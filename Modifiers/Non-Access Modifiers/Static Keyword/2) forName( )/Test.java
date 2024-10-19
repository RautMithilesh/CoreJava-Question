class Demo {
    static int a = fun(); // or we can write Demo.fun();  
    static int fun() {
        System.out.println("static variable executed");
        return 10;
    }
    static {
        System.out.println("static block executed");
    }
}

class Test {
    public static void main(String args[]) throws ClassNotFoundException{
        Class.forName("Demo"); 
    }
}