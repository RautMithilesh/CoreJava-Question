/*Write a java program to accept a number from command line
  and print whether number is armstrong or not
 */

class arm
 {
    public static void main (String args[])
    {
        int num = Integer.parseInt(args[0]);
    
        int i, j, digits = 0, power = 1, temp1, temp2, lastDigi, ans = 0;
        temp1 = num;
        temp2 = num;
    
        /* This loop checks number of digits because number of
        digits are used to power each digit of the number*/
        while (num > 0)
        {
            num = num / 10;
            digits++;
        } 
    
        //this block adds all the powered digits of the number
        for (i = 1; i <= digits; i++)
        {
            lastDigi = temp1 % 10;
            temp1 = temp1 / 10;
            for (j = 1; j <= digits; j++)
            {
                power = power * lastDigi;
            }
            ans = ans + power;
            power = 1;
        }
    
        /* This block checks whether powered and original number
        are same or not. */
        if (ans == temp2)
            System.out.println(temp2 + " is Armstrong number\n");
        else
            System.out.println(temp2 + " is not Armstrong number\n");
        }
    }