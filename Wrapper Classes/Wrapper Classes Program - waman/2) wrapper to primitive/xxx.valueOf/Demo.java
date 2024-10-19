class Demo 
{
    public static void main (String args[])
    {
        // creating wrapper object
        Integer iobj = new Integer(10);

        // converting to the primitive integer datatype
        int a = Integer.valueOf(iobj);
        System.out.println(a);
    }
}