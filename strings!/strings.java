
/**
 * Write a description of class strings here.
 *
 * @author Gabe nilsson
 * @version 25/02/2022
 */
import java.util.Scanner; //keyboard reading
public class strings
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class strings
     */
    public strings()
    {
        // initialise instance variables
        System.out.println("please imput two words");
        Scanner keyboard = new Scanner(System.in);
        String s1;
        String s2;
        String s3;
        s1 = keyboard.nextLine();
        s2 = keyboard.nextLine();
        s3 = s1. concat(s2);
        System.out.println(s3);
        int length = s3.length();
        System.out.println(s3.charAt(length -1));
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
