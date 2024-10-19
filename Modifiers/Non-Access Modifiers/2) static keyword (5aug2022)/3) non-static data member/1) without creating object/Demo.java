class Demo {
    int a = 10;
    public static void main (String args[]){
        System.out.println(a);
    }
}

/* This will give error because we cannot use non-static
   data member inside of static member function.
   but we can avoid this only if we create object of class demo
 */