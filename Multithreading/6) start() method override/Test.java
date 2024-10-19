
class myThread extends Thread
{
    public void start()
    {
        System.out.println("Overriding start() Method");
        super.start();
    }

    public void run()
    {
        System.out.println("run() method executed");
    } 
}

class Test
{
    public static void main(String[] args) 
    {
        myThread mt = new myThread();
        mt.start();
    }
}


/*  We Overrode start() method idf we want our own 
 library or want to intitilize some functions before 
 creation of new thread */