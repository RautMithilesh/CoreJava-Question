class Outer
 {
    void fun() 
    {
        int a = 10;
        class Inner 
        {
            void gun() 
            {
                System.out.println(a);  // from gun() stack
                /* here two separate stacks for fun and gun will be created.
                on stack of fun, "a" will get memory,
                after that copy of "a" variable will be created on stack of gun.
                So this both "a" variables are not connected to each other.
                */
            }           
        }
        Inner inr = new Inner();
        inr.gun();
        System.out.println(a);  // from fun() stack
    }
    public static void main (String args[]){
        Outer otr = new Outer();
        otr.fun();
    }
}