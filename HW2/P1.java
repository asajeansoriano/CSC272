import java.util.Scanner;
import java.util.Formatter;
import java.util.HashMap;

public class P1 {
    //Prime Number and Prime Factors
    
    //program that takes an integer input from user and determines if it is a prime number
    //if the integer is not a prime, put the prime factors of that number in a HashMap

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int input = in.nextInt();
        in.close();
        HashMap<Integer, Integer> prime_factors = new HashMap<Integer, Integer>();
        int i = 2;
        while (input > 1) {
            if (input % i == 0) {
                if (prime_factors.containsKey(i)) {
                    prime_factors.put(i, prime_factors.get(i) + 1);
                } else {
                    prime_factors.put(i, 1);
                }
                input /= i;
            } else {
                i++;
            }
        }
        System.out.println("The prime factors are: ");
        //print all prime_factors
        for (Integer key : prime_factors.keySet()) {
            System.out.println(key + "^" + prime_factors.get(key));
        }
    }
    
}
