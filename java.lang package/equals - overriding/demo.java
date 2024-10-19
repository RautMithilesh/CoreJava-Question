import javax.lang.model.util.ElementScanner6;

/* 
class student 
{
    int rollno ;
    String name ;

}

class demo 
{
   public static void main (String args[])
   {
      student s1 = new student();
      student s2 = new student();
      s1.rollno= 1 ;
      s2.name ="Tushar";
      System.out.println(s1==s2);
      System.out.println(s1.equals(s2));
   }
}

*/

// Overriding 

class student 
{
int rollno ;
String name ;

public boolean equals(Object obj)
{
    if(this == obj)
    {
        return true ;
    }
    else if(this instanceof Object)
    {
         student s = (student)obj ;
         return ( this.rollno = s.rollno &&  this.name.equals(s.name)) ;
    }
    else 
    {
        return false ;
    }
}
}

class demo
{
    public static void main(String[] args) 
    {
      student s1 = new student();
      student s2 = new student();
      s1.rollno= 1 ;
      s2.name ="Tushar";
      System.out.println(s1==s2);
      System.out.println(s1.equals(s2));
    }
}