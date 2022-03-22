
/**
 * Write a description of class IntTest here.
 *gabe nilsson
 * @author (your name)
 * @version (a version number or a date)
 */
public class IntTest
{
    // instance variables - replace the example below with your own
    private int x;
    public int year=2020;
    /**
     * Constructor for objects of class IntTest
     */
    public IntTest()
    {
        // initialise instance variables
        x = x+1;
        System.out.println(x);
        System.out.println(x+year);
        x++;
        System.out.println(x);
        x *= x * year;
        System.out.println(x);
        x /= x / year;
        System.out.println(x);
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
