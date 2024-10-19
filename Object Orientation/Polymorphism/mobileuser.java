

interface sim 
{
 abstract void call();
 abstract void text() ;   
}

 class airtel implements sim 
{
  public void call()
  {
    System.out.println("call through airtel");
  }

  public void text()
  {
  System.out.println("text through airtel ");
  }
}

 class jio implements sim 
{

  public void call()
  {
    System.out.println("call through jio");
  }

  public void text()
  {
  System.out.println("text through jio");
  }
}

 class vi implements sim 
{

  public void call()
  {
    System.out.println("call through vi");
  }

  public void text()
  {
  System.out.println("text through vi");
  }
}

class mobileuser
{
  public static void main(String[] args)
 {
    sim s1 = new airtel() ;
    s1.call() ;
    s1.text() ;
     
    sim s2 = new jio ();
    s2.call () ;
    s2.text () ;
  
    sim s3 = new vi () ;
    s3.call () ;
    s3.text() ;
    
  }
}

