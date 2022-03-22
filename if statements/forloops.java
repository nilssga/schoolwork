
/**
 * Write a description of class forloops here.
 *
 * @author (Gabe Nilsson)
 * @version (a version number or a date)
 */
import java.util.Scanner;//keyboard input
public class forloops
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class forloops
     */
    public forloops()
    {
        System.out.println('\u000c');
        Scanner keyboard =new Scanner(System.in);
        System.out.println("please enter a number");
        int number = keyboard.nextInt();
        keyboard.nextLine();
        System.out.println("please enter a line");
        String s1;
        s1 = keyboard.nextLine();
        for (int i=0; i<number;i++)
            System.out.println(i + ":" +s1);
        // initialise instance variable
        for(int i=0; i < 100; i = i + 7) {
          if (i %5==0){
            System.out.println(i +"***");
          } else {
            System.out.println(i);
          }
        }
        char leters = 'Z';
        for (int i =26; i > 1; i = i - 3){
        System.out.println(leters);
        leters--;
        leters--;
        leters--;
    }
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
