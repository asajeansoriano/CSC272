import java.util.Formatter;
import java.util.HashMap;
import java.util.Scanner;
import java.security.SecureRandom;
import java.io.File;

public class P2 {

    public static void main (String[] args) {
        final int SIZE = 10000;
        //generate 10000 random integers between 0 and 9 including both 0 and 9
        SecureRandom randomNumbers = new SecureRandom();
        //write each random number to file numbers.txt
        File file = new File("numbers.txt");
        try {
            Formatter output = new Formatter(file);
            for (int i = 0; i < SIZE; i++) {
                output.format("%d\n", randomNumbers.nextInt(10));
            }
            output.close();
        } catch (Exception e) { //catch any exceptions 
            System.out.println("Error: " + e.getMessage());
        }

        //read integers from numbers.txt and count frequency of each unique number
        HashMap<Integer, Integer> numberCount = new HashMap<Integer, Integer>();
        try {
            Scanner input = new Scanner(file);
            while (input.hasNext()) {
                int number = input.nextInt();
                if (numberCount.containsKey(number)) {
                    numberCount.put(number, numberCount.get(number) + 1);
                } else {
                    numberCount.put(number, 1);
                }
            }
            input.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        File out = new File("output.txt");
        //put numberCount in output.txt
        try {
            Formatter output = new Formatter(out);
            output.format("Number\t\tCount\n");
            for (int i = 0; i < 10; i++) {
                output.format("%d\t\t%d\n", i, numberCount.get(i));
            }
            output.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        //print the numberCount table
        System.out.println("Number\t\tCount");
        for (int n : numberCount.keySet()) {
            System.out.printf("%d\t\t%d\n", n, numberCount.get(n));
        }
    }
    
}
