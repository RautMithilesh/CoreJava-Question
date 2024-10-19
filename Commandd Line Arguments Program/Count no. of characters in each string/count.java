//import java.net.SocketPermission;

//import javafx.scene.effect.Light.Spot;

/* Write a java program to accept n strings from command line & 
   count no. of characters in each string
 */

 
class count 
 {
    public static void main (String args[])
    {
        int stringCount = args.length;

        for (int i = 0; i < stringCount; i++)
         {
            int charCount = args[i].length();
            System.out.println("count is " + charCount); 
         }
    }
 }


/*
 
class count 
{
    public static void main (String args[])
    {

        System.out.println("Number of characters in first string are " + args[0].length()) ;
        
        System.out.println("Number of characters in first string are " + args[1].length()) ;
        
        System.out.println("Number of characters in first string are " + args[2].length()) ;
        
        System.out.println("Number of characters in first string are " + args[3].length()) ;
    }
}

 */