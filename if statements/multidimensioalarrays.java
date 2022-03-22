
/**
 * Write a description of class multidimensioalarrays here.
 *
 * @author (gabe nilsson)
 * @version (a version number or a date)
 */
public class multidimensioalarrays
{
    // instance variables - replace the example below with your own


    /**
     * Constructor for objects of class multidimensioalarrays
     */
    public multidimensioalarrays()
    {
        System.out.println('\u000c');
        int table[][] = new int[5][5];
        for(int x=0; x<5;x++) {
            for(int y=0;y<5;y++){
               System.out.print(table[x][y]+" ");
            }
            System.out.println();
        }
    }
}