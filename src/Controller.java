import java.util.Arrays;

public class Controller {


    public static void main(String[] args) {
        GettingSorted gettingSorted = new GettingSorted();

        int unsorted[] = gettingSorted.getRandomArray(30, 50);

        System.out.println("Bubble sorting method returns: \n"
                + Arrays.toString(unsorted) + "\n"
                + Arrays.toString(gettingSorted.getSortedByBubbleArray(unsorted)));
    }
}
