import java.util.Random;   // needed for Random class

public class RandomSamples
{
    public static void main(String[] args)
    {

        /**********************************************************/
        /*                      Random Class                      */
        /**********************************************************/

        Random rg = new Random( );

        int n1 = rg.nextInt(20);                   // range 0..19
        int n2 = rg.nextInt(10) + 40;              // range 40..50
        int n3 = rg.nextInt(30) - 30;              // range -30..0

        System.out.println("Range 0..19  -> " + n1);
        System.out.println("Range 40..50  -> " + n2);
        System.out.println("Range -30..0 -> " + n3);
        System.out.println();

        /**********************************************************/
        /*                       Math Class                       */
        /**********************************************************/

        int n4 = (int)(Math.random() * 19);        // range 0..19
        int n5 = (int)(Math.random() * 10) + 40;   // range 40..50
        int n6 = (int)(Math.random() * 30) - 30;   // range -30..0

        System.out.println("Range 0..19   -> " + n4);
        System.out.println("Range 40..50  -> " + n5);
        System.out.println("Range -30..0  -> " + n6);

    }
}