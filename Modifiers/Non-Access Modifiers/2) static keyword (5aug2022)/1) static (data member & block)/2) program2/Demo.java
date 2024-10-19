class Demo {
    static {
        System.out.println("static block executed");
    }

    static int a = fun(); // or we can write Demo.fun();  

    static int fun() {
        System.out.println("static variable executed"); 
        return 10;
    }

    public static void main(String args[]) {
        System.out.println("main method executed");
    }
}

/* Firstly the static block executes
   after that static variable gets executed  
   after that the main function executes 

   main function cannot execute before static member function & static data member,
   even if the main function is written first
 */