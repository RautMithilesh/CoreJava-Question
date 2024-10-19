
class outer 
{
     class inner
     {
        void fun()
        {
            System.out.println("Hello from inner class .");
        }

     }

     public static void main(String[] args)
      {
        outer o = new outer() ;
        outer.inner i = o.new inner() ;
        i. fun();
      }
}
