
import java.util.PriorityQueue;


class Test
{
    public static void main (String args[])
    {
        PriorityQueue<String> pq = new PriorityQueue <String>();
        pq.add("Virat");
        pq.add("ABD");
        pq.add("Leo");
        pq.add("CR7");
        System.out.println(pq);

        // 1. public object offer(object obj);
        System.out.println(pq.offer("MSD"));

        // 2. public object poll(object obj);
        System.out.println(pq.poll());

        // 3. public pbject remove(object obj);
        System.out.println(pq.remove("CR7"));

    }
}