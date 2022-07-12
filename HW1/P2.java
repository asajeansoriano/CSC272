import java.io.File;
import java.util.Formatter;
import java.util.HashMap;
import java.util.Scanner;

public class P2 {

    //Every seven-letter word corresponds to exactly one seven-digit telephone number
    //e.g. 825-3688 is "TAKEOUT"
    //424-7288 is "HAIRCUT"
    //738-2273 is "PETCARE"
    //639-2277 is "NEWCARS"
    //This program, given a seven-digit number, uses a Formatter object to write to a file every possible seven-letter word combination corresponding to that number

    public static void main(String[] args) {
        //keypad arraylists where the digit is the key and the value are the letters
        HashMap<Integer, String> keypad = new HashMap<Integer, String>();
        keypad.put(2, "ABC");
        keypad.put(3, "DEF");
        keypad.put(4, "GHI");
        keypad.put(5, "JKL");
        keypad.put(6, "MNO");
        keypad.put(7, "PQR");
        keypad.put(8, "TUV");
        keypad.put(9, "WXY");

        //find every permutation of 0, 1, 2 in 7 seven numbers
        //the 0, 1, 2 represent the corresponding keypad value
        //e.g. "ABC" is "012"
        for (int index = 0; index < 7; index++) {
            for (int i = 0; i < 2; i++) {
                
            }
        }

        //write to String output
        String output = "";

        //get the number from the user
        System.out.println("Please enter a seven-digit number: ");
        Scanner input = new Scanner(System.in);
        int phoneNumber = Integer.parseInt(input.nextLine());
        String combination = "";

        //find every letter combination for phone number and write to output
        for (int i = 0; i < 7; i++) {
            int digit = (phoneNumber / (int) Math.pow(10, i)) % 10;
            //get letters from digit by splitting the keypad value and put into string array
            String[] letters = keypad.get(digit).split("");
            //given the seven-digit phone number, find every possible letter combination corresponding to the digit
            for (int j = 0; j < 7; j++) {
                combination += letters[j];
            }
            combination += "\n";
            output.concat(combination);
        }
    

        System.out.println(output);
    }
}
