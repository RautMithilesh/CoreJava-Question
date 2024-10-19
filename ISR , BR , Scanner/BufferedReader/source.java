
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class source
 {
public static void main (String args[])throws IOException
{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader (isr);

        System.out.print("Enter a string : ");   

        String S = br.readLine();

        System.out.println("Your string is :"+S);
        
    }
}