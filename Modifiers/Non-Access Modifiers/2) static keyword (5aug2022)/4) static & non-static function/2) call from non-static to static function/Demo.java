class Demo {
    static void fun() {
        System.out.println("static fun executed");
    }

    void gun() {
        fun();
    }
    public static void main(String args[]) {
        Demo obj = new Demo();
        obj.gun();
    }
}

/* static fun executed because we can call from non-static
   function gun() to the static function fun(), because gun() has
   this pointer
 */