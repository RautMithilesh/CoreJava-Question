
class myThread extends Thread
{
   public void run()
   {
     for(int i=0; i<10;i++)
     {
        System.out.println("Thread in run method : " +i);
     }
   }
       
   public void fun()
   {
     for(int i=10; i<1; i--)
     {
        System.out.println("Thread in fun method : " +i);
     }
   }
}

class Test
{
    public static void main(String[] args)
    {
         myThread mt = new myThread();
         mt.start();
         for(int i=0 ; i<10 ; i++)
         {
            System.out.println("Main Thread " +i);
         }
    }
}