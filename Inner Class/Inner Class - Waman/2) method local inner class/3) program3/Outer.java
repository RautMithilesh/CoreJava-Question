 /* now as we have made "a" as final, so it will not allow to change "a" either in fun or gun function


 */
class Outer {
    void fun() {
        final int a = 10;
        class Inner {
            void gun() {
                System.out.println(a);   // from stack of gun
                // a++;   
                //"a" is final

                /* here two separate stacks for fun and gun will be created.
                on stack of fun, "a" will get memory,
                after that copy of "a" variable will be created on stack of gun.
                So this both "a" variables are not connected to each other.
                */
            }           
        }
        Inner inr = new Inner();
        inr.gun();
        System.out.println(a);   // from stack of fun
        // a++; 
        // "a" is final

        /* now we have changed value of "a" on stack of fun, 
        but it will not be reflect on stack of gun because we dont have pointer concept in java,
        so there is only one option that is we should make the "a" variable of fun as final,
        so it will not be changed on stack of fun, therefore "a" variable of gun function will also be final,
        at last both "a" variables are final, so there is not any possibility of changing any one of them
         */
    }
    public static void main (String args[]){
        Outer otr = new Outer();
        otr.fun();
    }
}