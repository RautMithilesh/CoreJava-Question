class myThread implements Runnable 
{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("Hello" +i);
        }
    }
}

class myThread2 implements Runnable 
{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("New" +i);
        }
    }
}

class demo
{
    public static void main(String[] args) 
    {
        myThread mt = new myThread();
        Thread t = new Thread(mt);
        t.start();
        myThread2 mt2= new myThread2();
        Thread t2 = new Thread(mt2);
        t2.start();
    }
}
