
/**
 * Write a description of class CopyOfPayMent here.
 *gabe nilsson
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;// keyboard imput
public class CopyOfPayMent
{
    // instance variables - replace the example below with your own
    int payment;
    private int OverTime; 
    /**
     * Constructor for objects of class CopyOfPayMent
     */
    public CopyOfPayMent()
    {
       System.out.println("how many hours worked?"); 
       Scanner keyboard = new Scanner(System.in);
       int number;
       number=keyboard.nextInt();
            if(number >= 40){
                OverTime = number - 40;
                payment = 880 + (OverTime * 30);
            }else{
                payment = number * 22;
            }
       System.out.println("the payment is "+payment+"$");
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */


}
