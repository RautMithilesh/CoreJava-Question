
 class inline extends Thread
{
    public static void main(String[] args)
    {
        System.out.println("Main Thread Executed !!!");

        new Thread()
        {
            public void run()
            {
                for(int i=0 ; i<5 ; i++)
                {
                     System.out.println("new thread executed "+i);
                }
            }
        }.start();

        System.out.println("Main Thread Finished !!!");
    }
}
