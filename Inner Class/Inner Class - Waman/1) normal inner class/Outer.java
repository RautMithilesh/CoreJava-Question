class Outer 
{
    int a = 10;
    class Inner 
    {
        int a = 20;
        void print()
         {
            System.out.println(a);
            System.out.println(this.a);
            System.out.println(Outer.this.a);
        }
    }

    public static void main (String args[]){
        Outer otr = new Outer();
        Inner inr = otr.new Inner();
        inr.print();
    }
}