/* 
class DaemonThread extends Thread 
{
    public void run()
    {
        if(Thread.currentThread().isDaemon())
        {
            System.out.println("Daemon Thread executed !!!");
        }
        else
        {
            System.out.println("Non-Daemon Thread executed !!!");
        }
    }

    public static void main(String[] args)
    {
        DaemonThread dt1 = new DaemonThread();
        DaemonThread dt2 = new DaemonThread();
        DaemonThread dt3 = new DaemonThread();

        dt1.setDaemon(true);

        dt1.start();
        dt2.start();
        dt3.start();
    }
}
*/



class demo extends Thread 
{
   public void run()
   {
    for(int i=0 ; i<100 ; i++)
    {
       System.out.println("demo thread executed"+i);
    }
   }
}


class Test
{
    public static void main(String[] args)
    {
        demo d = new demo ();

        d.setDaemon(true);
        d.start();
     
        for(int i=0 ; i<5 ; i++)
        {
            System.out.println("main thread executed " +i);
        }
    }
}
