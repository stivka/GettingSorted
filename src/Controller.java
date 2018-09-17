import java.util.Arrays;

public class Controller {


    public static void main(String[] args) {
        RandomArray randomArray = new RandomArray();
        int unsorted[] = randomArray.getRandomArray(30, 50);

        Bubble1 bubble1 = new Bubble1();
        System.out.println("Bubble sorting method returns: \n"
                + Arrays.toString(unsorted) + "\n"
                + Arrays.toString(bubble1.getSortedByBubble1Array(unsorted)));

        Bubble2 bubble2 = new Bubble2();
    }
}
