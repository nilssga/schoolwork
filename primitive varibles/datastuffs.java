
/**
 * Write a description of class datastuffs here.
 *Gabe nilsson
 * @author (your name)
 * @version (a version number or a date)
 */
public class datastuffs
{
    // instance variables - replace the example below with your own
     byte smaller=20;
     short small= 30;
     int normal=40;
     long big = 50;
     float smallfloat = 20f;
     float normalfloat = 40;
     boolean work=true;
     char letter = 'f';
    /**
     * Constructor for objects of class datastuffs
     */
    public datastuffs()
    {
        // initialise instance variables
        System.out.println(smaller);
        System.out.println(small);
        System.out.println(normal);
        System.out.println(big);
        System.out.println(smallfloat);
        System.out.println(normalfloat);
        System.out.println(work);
        System.out.println(letter);
        System.out.println(smaller + small);
        //System.out.println(work + letter);
        System.out.println("tried to add boolean and letter, it would not compile");
        System.out.println(letter + smaller+ " this is f + 20, idk whats going on because i don't know the ASCII code for f");
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */

}