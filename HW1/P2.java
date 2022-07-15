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

        String permutation = "";
        String combinations[] = new String[2187];
        int ctr = 0;

        //find every permutation of 0, 1, 2 in 7 seven numbers
        //the 0, 1, 2 represent the corresponding keypad value
        //e.g. "ABC" is "012"
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        for (int m = 0; m < 3; m++) {
                            for (int n = 0; n < 3; n++) {
                                for (int o = 0; o < 3; o++) {
                                    permutation = String.valueOf(i) + String.valueOf(j) + String.valueOf(k) + String.valueOf(l) + String.valueOf(m) + String.valueOf(n) + String.valueOf(o);
                                    combinations[ctr++] = permutation;
                                }
                            }
                        }
                    }
                }
            }
        }
        
        //write to String output
        String output = "";

        //read in the seven-digit number
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a seven-digit number: ");
        String number = in.nextLine();

        //iterate through combinations list and match the number to the keypad
        for (int i = 0; i < 2187; i++) {
            String temp = combinations[i];
            for (int j = 0; j < 7; j++) {
                int temp_index = Character.getNumericValue(temp.charAt(j));
                int number_index = Character.getNumericValue(number.charAt(j));
                //split keypad value and match to the corresponding digit
                String keypad_value[] = keypad.get(number_index).split("");
                output += keypad_value[temp_index];
            }
            output += "\n";
        }
        //System.out.println(output);

        //write output to file
        File file = new File("output.txt");
        System.out.println("Writing to file...");
        try {
            System.out.println("Done! See output.txt");
            Formatter output_file = new Formatter(file);
            output_file.format(output);
            output_file.close();
        } catch (Exception e) {
            System.out.println("Error writing to file");
        }
    }
}
