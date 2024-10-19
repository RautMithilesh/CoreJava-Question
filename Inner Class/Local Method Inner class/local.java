import org.omg.Messaging.SyncScopeHelper;

class local 
{
    void fun ()
    {
       class inner
       {
           int b =20 ;
       }
           inner i = new inner() ;
           System.out.println("Value of b " + i.b) ;
    }

    public static void main(String[] args) {
        
    
              local l = new local();
              l.fun();
    }


}

