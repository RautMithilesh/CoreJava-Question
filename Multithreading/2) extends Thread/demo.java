

class myThread extends Thread
{
    public void run()
    {
        for(int i=0 ; i<10 ; i++)
        {
            System.out.println("run() method executed to thread" +i);
        }
    }
}

class demo
{
    public static void main(String[] args) 
    {
        myThread mt = new myThread();
        mt.start();
        
        for(int i=0 ; i<10 ; i++)
        {
            System.out.println("main() method executed to thread" +i);
        }
        
    }
}
