
/**
 * Write a description of class loops here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class loops
{
    int devisable5;
    int counter =0;
    int devisable27;
    int stopping;
    boolean stillcounting=true;
    boolean keepgoing = true;
    /**
     * Constructor for objects of class loops
     */
    public loops()
    {
        System.out.println('\u000c');// clear the screan
        while (stillcounting && keepgoing){
            devisable5 = counter%5;    
            if(devisable5 == 0  ){
                System.out.println(counter);    
            }
            devisable27 = counter%27;
            if(devisable27 == 0){
                System.out.println(counter);
                stopping++;
                if(stopping == 4){ //i didn't want zero to be counted
                    keepgoing = false;
                }
            }
            counter++;
            if(counter > 100) {
                stillcounting = false;
            }
        }
    }
}
