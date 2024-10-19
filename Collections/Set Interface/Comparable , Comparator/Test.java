
import java.util.Comparator;
import java.lang.Comparable;
import java.lang.TreeSet ;


class MyComparator implements java.util.Comparator
{
    public int compare(StringBuffer sb1 , StringBuffer sb2)
    {
       
    }
}




class Test
{
    public static void main(String[] args) 
    {
        StringBuffer sb1 = new StringBuffer() ;
        StringBuffer sb2 = new StringBuffer() ;

        MyComparator mc = new MyComparator();
        TreeSet ts = new TreeSet(mc);
        ts.add(sb1);
    }

}


/* 


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

*/