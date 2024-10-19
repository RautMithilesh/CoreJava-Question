class Outer 
{
    static class Inner
     {
        void print() 
        {
            System.out.println("print method of static inner class executed");
        }
    }

    public static void main(String args[]) 
    {
        // here we can directly make object of Inner class without creating object of outer class
        Inner i1 = new Inner();
        i1.print();
       
        //                         OR

        // we can first create object of Outer class & then create object of inner class
        Outer o = new Outer();
        Outer.Inner i2 = new Inner();
        i2.print();
    }
}