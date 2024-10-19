
class demo implements Runnable 
{
    public void run()
    {
        System.out.println("child thread is running !!");;

        for(int i=0 ; i<4 ; i++)
        {
            System.out.println("Thread : "+i);
        }

        System.out.println("child thread finished !!");
    }

    public static void main(String[] args) 
    {
        demo d = new demo();
        Thread t = new Thread(d);
        t.start();

        System.out.println("Main thread is running !!");
        System.out.println(t);

        try
        {
            t.join();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

        System.out.println("Main Thread is ending !!");
    }
}