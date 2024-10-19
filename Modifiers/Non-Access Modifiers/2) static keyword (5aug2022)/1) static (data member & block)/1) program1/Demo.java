class Demo {
    static int a = fun(); // or we can write Demo.fun();  

    static int fun() {
        System.out.println("static variable executed"); 
        return 10;
    }

    static {
        System.out.println("static block executed");
    }
    public static void main(String args[]) {
        System.out.println("main method executed");
    }
}

/* Firstly static variable gets executed
   after that the static block executes
   after that the main function executes 

   if static block is written before static data member,
   then static block is executed first then static data member executes,
   and at last main function executes.
   main function cannot execute before static data member & static member function,
   even if the main function is written first
 */