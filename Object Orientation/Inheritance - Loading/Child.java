class Parent {
    static int a = fun();

    static int fun() {
        System.out.println("static variable of parent executed");
        return 10;
    }

    {
        System.out.println("Non-static block of parent");
    }

    static {
        System.out.println("Static block of parent executed");
    }

    Parent() {
        System.out.println("Constructor of parent");
    }
    // constructor executes at last
  
    
}

class Child extends Parent {
    static int b = gun();

    static int gun() {
        System.out.println("static variable of child executed");
        return 10;
    }

    {
        System.out.println("Non-static block of child");
    }

    static {
        System.out.println("Static block of child executed");
    }

    Child() {
        System.out.println("Constructor of child");
    }
    public static void main (String args[]){
        Child obj = new Child();
    }
}