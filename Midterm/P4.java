import java.util.HashMap;
import java.util.Scanner;

public class P4 {
    public static void main (String[] args) {
        //Hashmap Histogram
        //create a HashMap to compute histogram of positive numbers from user input, where the key is the number and the value is the frequency
        
        HashMap<Integer, Integer> histogram = new HashMap<Integer, Integer>();
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int number = in.nextInt();
            if (number == -1) {
                break;
            }
            if (histogram.containsKey(number)) {
                histogram.put(number, histogram.get(number) + 1);
            } else {
                histogram.put(number, 1);
            }
        }
        in.close();
        printHistogram(histogram);
    }

    public static void printHistogram(HashMap<Integer, Integer> histogram) {
        //print the histogram
        for (int number : histogram.keySet()) {
            System.out.printf("The number %d occurs %d times.\n", number, histogram.get(number));
        }
    }
    
}
