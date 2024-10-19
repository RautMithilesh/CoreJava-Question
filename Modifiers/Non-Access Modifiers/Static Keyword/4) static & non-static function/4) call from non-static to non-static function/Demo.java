class Demo {

    void gun() {
        System.out.println("non-static gun executed");
    }

    void fun() {
        gun();
    }

    public static void main(String args[]) {
        Demo obj = new Demo();
        obj.fun();
    }
}

/* non-static function gun() can executed because
   we can call from non-static function fun() to the non-static
   function gun(), because fun() have this pointer, beacause
   we have created object of class.
 */