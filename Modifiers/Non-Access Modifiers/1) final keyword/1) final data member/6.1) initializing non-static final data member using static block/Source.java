class Source {
    final int a;

    // static block
    static {
        a = 30;
    }
    public static void main (String args[]){
        Source obj = new Source();
    }
}

/* This program will give error because non-static data member "a"
    cannot be used in static block
    
    error message: non-static variable "a" cannot be referenced from a static context
            OR
    error message: Cannot make a static reference to the non-static field "a"     
   
    so in next program(6.2), we will make the variable "a" static, so it will work in
    static block
*/