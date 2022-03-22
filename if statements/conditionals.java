
/**
 * Write a description of class conditionals here.
 *Gabe nilsson
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;//keyboard input
public class conditionals
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class conditionals
     */
    public conditionals()
    {
        // initialise instance variables
        Scanner keyboard =new Scanner(System.in);
        int number_of_people;
        number_of_people = keyboard.nextInt();
        if  (number_of_people == 1) {
            System.out.println("tēnā koe");
        } else if (number_of_people == 2) {
            System.out.println("tēnā kōrua");
        } else {
            System.out.println("tēnā koutou");
        }
        int number;
        number = keyboard.nextInt();
        int remainder = number%5;
        int even = number%2;
        keyboard =new Scanner(System.in);
        if (remainder == 0) {
            System.out.println("that number is divisable by 5");
        } else {
            System.out.println("that number is not divisable by 5");
        }
        if (even == 0) {
            System.out.println("that number is even");
        } else {
            System.out.println("that number is odd");
        }
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
