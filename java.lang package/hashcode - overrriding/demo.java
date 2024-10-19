
class student 
{
    int a=10;
    int b=20 ;

      student(int a , int b)
      {
        this.a=a;
        this.b=b;
      }

      public int hashcode()
      {
        return a+b ;
      }

      class demo
      {
        public static void main(String[] args)
        {
            student s = new student(0, 0) ;
           System.out.println(s.hashcode);
        }
      }
}