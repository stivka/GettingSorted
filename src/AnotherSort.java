import java.util.*;

/**
 * Bubble sorting algorithm and its' variations.
 *
 * @author Stiv
 * @version 1.0
 * @since 28/11/2016.
 */
public class GettingSorted {


    int[] AnotherSort (int[] unsorted) {
        long tStart = System.currentTimeMillis();
        int[] max = new int[3];
        /* must be a size 3 array: value(0) and position(1) of current max,
         and value(3) of the to be overwritten smaller value. The
          last of which will be used to replace the value and position of the
          max.
         Using an array instead of 3 variables. I don't
         know whether it's more efficient, but going for it since the data
         is tied together between them, and i have to create two variables
         less - if we consider an array as a variable.
         *  */
        int j = 0;
        for ( int i = 0; i < unsorted.length - j; i++ ) {
            if ( unsorted[i] > max[0] ) {
                max[0] = unsorted[i];
                max[1] = i;
                /* so it saves the current highest value + where it is
                 * located. */
            }
            if ( i == unsorted.length - 1 ) {
                // so when you're at the end of the array..
                max[2] = unsorted[i];
                // saved the smaller number's value
                unsorted[i] = max[0];
                unsorted[max[1]] = max[2];
                j++;
                /* since one number is sorted already, moved to the end
                * of the array, the next number can move to the position
                * only before it. then you may skip checking from the last
                 * number that has been positioned. Max is also reverted back
                 * to the minimum value, which in this case is 0.
                * */
                i = 0;
            }

        }
        long tEnd = System.currentTimeMillis();
        long tDelta = tEnd - tStart;
        double elapsedSeconds = tDelta / 1000.0;
        System.out.println("This is bubble sorting according to AnotherSort:");
        System.out.println(Arrays.toString(unsorted));
        System.out.println("Time elapsed " + elapsedSeconds + " seconds.");
        return unsorted;
    }
}
