class Source {
    final int a;

    Source() {
       System.out.println("constructor");
    }

    // non-static block
    {
        a = 30;
        System.out.println("non-static block");
    }
    public static void main (String args[]){
        Source obj = new Source();
    }
}

/* This program will NOT give error because
    we have firstly initialized the variable and not
    assigned any value after the initialization
   
*/