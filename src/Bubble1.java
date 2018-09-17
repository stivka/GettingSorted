public class Bubble1 {
    /**
     * This method conveys my first effort towards a bubble sorting
     * algorithm. The array in itself is sorted
     * (no auxiliary array is used) by overwriting adjacent values. First
     * one value is stored in the variable 'c' (which is a 'vahemuutuja'
     * and is short for 'copy'). Then this corresponding array element is
     * overwritten and so is the other array element overwritten to the
     * value of c.
     * Boolean s is used a a switch. Determined to assign the array another
     * lookover until no changes have been made, in which case no changes
     * are to be made.
     *
     * @param unsorted
     * @param sorted
     * @return
     */

    int[] getSortedByBubble1Array(int[] unsorted) {
        int c = 0;
        boolean s = false;
        for (int i = 1; i < unsorted.length; i++ ) {
            if (unsorted[i - 1] > unsorted[i]) {
                s = true;
                c = unsorted[i];  // vahemällu
                unsorted[i] = unsorted[i - 1];
                unsorted[i - 1] = c;
            }
            if (i == unsorted.length - 1 && s == true) {
                i = 0; // cursor brought back to 0
                s = false;
            }
        }
        return unsorted;
    }
}
