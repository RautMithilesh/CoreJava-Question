class Outer
 {
    static 
    {
        System.out.println("static block of Outer class executed");
    }
    
    static class Inner 
    {
        static 
        {
            System.out.println("static block of Inner class executed");
        }
    }
    public static void main (String args[])
    {
        System.out.println("main function executed");
    }
}