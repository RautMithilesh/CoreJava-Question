//  If we directly call a run() method instead of start() method

import java.util.Scanner;
class demo 
{
  
    public static void main(String[] args) 
    {
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        s= sc.nextline();
        System.out.println("after reversing the string :");
        for(int i=s.length();i>0;--i)
        {
            System.out.println(s.charAt(i-1));
        }


    }
}