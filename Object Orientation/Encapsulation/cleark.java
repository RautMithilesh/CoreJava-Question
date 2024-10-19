
class student
{
    private int age ;

    public void setage(int age)
    {
        if(age>0)
        {
        this.age=age ;
        }
        else
        {
        System.out.println("please enter valid age");
        }
    }

   public int getgae()
    {
        return age;
    }

class cleark 
{
    public static void main (String[] args)
    {
    student aditya = new student() ;
     aditya.setage();
     aditya.getage();

     System.out.println("Age od student is : ");
        
    }
    
}

