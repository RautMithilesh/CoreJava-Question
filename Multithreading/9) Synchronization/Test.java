class myThread1 extends Thread
{
    Addition add;
    myThread1(Addition add)
    {
        this.add = add;
    }
    public void run()
    {
        add.addition(10,20);
    }
}

class myThread2 extends Thread
{
    Addition add;
    myThread2(Addition add)
    {
        this.add = add;
    }
    public void run()
    {
        add.addition(100,200);
    }
}

class Addition
{
    int x;
    int y;
    synchronized public void addition(int x, int y)
    {
        this.x = x;
        this.y = y;
        try
        {
            Thread.sleep(1000);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

        System.out.println("X is: "+x+" Y is: "+y);
        int ans = x+y;
        System.out.println("Addition is"+ans);
    }
}


class Test
{
    public static void main(String args[])
    {
        Addition add = new Addition();
        myThread1 t1 = new myThread1(add);
        myThread2 t2 = new myThread2(add);

        System.out.println(t1.getName());
        System.out.println(t2.getName());
        
        t1.start();   
        System.out.println(Thread.currentThread());
        t2.start();
        System.out.println(Thread.currentThread());
        
    }  
}