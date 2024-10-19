class MyThread extends Thread 
{
    public void run() 
    {
        try 
        {
            for (int i = 1; i <= 4; i++) 
            {
                Thread.sleep(3000); // current executing thread sleeps for 3 sec
                System.out.println(getName() + " instruction-" + i);
            }
        } 
        catch (Exception ex) 
        {
            System.out.println(ex);
        }
    }
}

class Test
 {
    public static void main (String args[]) throws InterruptedException 
    {
        MyThread mt0 = new MyThread();
        MyThread mt1 = new MyThread();
        mt0.start(); // Thread-0
        mt1.start(); // Thread-1
    }
}