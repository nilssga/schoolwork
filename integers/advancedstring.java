
/**
 * Write a description of class advancedstring here.
 * Gabe nilsson
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;//keyboard input
public class advancedstring
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class advancedstring
     */
    public advancedstring()
    {
        System.out.println('\u000c');
        Scanner keyboard = new Scanner(System.in);
        System.out.println("please enter a string");
        String s1;
        s1 = keyboard.nextLine();
        System.out.println(s1);
        // initialise instance variables
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
