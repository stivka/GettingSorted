import java.util.Random;

class RandomArray {
    int[] getRandomArray(int arrayLength, int integerBound) {
        int[] unsorted = new int[arrayLength];
        Random rand = new Random();
        for( int i = 0; i < unsorted.length; i++ ) {
            unsorted[i] = rand.nextInt(integerBound);
        }
        return unsorted;
    }
}
