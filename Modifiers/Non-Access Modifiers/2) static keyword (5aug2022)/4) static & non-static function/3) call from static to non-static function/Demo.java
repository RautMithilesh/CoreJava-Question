class Demo {

    void gun() {
        
    }

    static void fun() {
        gun();
    }

    public static void main(String args[]) {
        Demo.fun();
    }
}

/* non-static function gun() cannot executed because
   we cannot call from static function fun() to the non-static
   function gun(), because fun() does not have this pointer, beacause
   we have not created object of class.
 */