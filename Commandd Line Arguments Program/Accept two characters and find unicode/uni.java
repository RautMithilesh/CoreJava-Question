
class uni 
{
        public static void main (String args[])
    {

       char a = args[0].charAt(0) ;
       char b = args[1].charAt(0) ;
       int x = a ;
       int y = b ;

       if (y>x)
       {
        int sub = y-x ;

        for(int i=x ; i<y ; i++)
        {
            System.out.println(i);
        }
       }
       else
       {
        int sub = x-y ;

        for(int i=y ; i<=x ;i++)
        {
            System.out.println(i);
        }
       }
    }
}