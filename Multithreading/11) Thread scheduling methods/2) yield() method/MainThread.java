
class Thread1 extends Thread
{
    public void run()
    {
        for(int i=0 ; i<3 ; i++)
        {
            System.out.println(Thread.currentThread().getName()+" is Running");
            //Thread.yield();
        }
    }
}

class Thread2 extends Thread
{
    public void run()
    {
        for(int i=0 ; i<3 ; i++)
        {
            System.out.println(Thread.currentThread().getName()+" is Running");
        }
    }
}

class MainThread
{
    public static void main(String[] args) 
    {
      Thread1 t1 = new Thread1();
      Thread2 t2 = new Thread2();
      t1.yield();
      t1.start();
      t2.start();      
    }
}