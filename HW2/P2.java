import java.util.Scanner;


public class P2 {
    //program that writes a recursive function testPalindrome that returns true if string is a palindrome and false otherwise (ignore spaces and punctuation)

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = in.nextLine();
        in.close();
        if (testPalindrome(input)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }

    public static boolean testPalindrome(String input) {
        if (input.length() == 0) {
            return true;
        } else if (input.length() == 1) {
            return true;
        } else if (input.charAt(0) == input.charAt(input.length() - 1)) {
            return testPalindrome(input.substring(1, input.length() - 1));
        } else {
            return false;
        }
    }
}
