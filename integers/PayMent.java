
/**
 * Write a description of class PayMent here.
 *gabe nilsson
 * @author (your name)
 * @version (a version number or a date)
 */
public class PayMent
{
    // instance variables - replace the example below with your own
    private int hours=50;
    private int OverTime; 
    /**
     * Constructor for objects of class PayMent
     */
    public PayMent()
    {
        // initialise instance variables
        if(hours >= 40){
        OverTime = hours - 40;
        System.out.println(880 +(OverTime * 30));
    }else{
        System.out.println(hours * 22);
    }
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */


}
