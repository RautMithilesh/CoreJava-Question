
// What if we started a thread twice
// IllegalThreadStateExecption


class demo extends Thread
{
    public void run()
    {
        System.out.println("Thread Running !!!");
    }

    public static void main(String[] args)
    {
          demo d = new demo();
          d.start();
          d.start();  
    }
}