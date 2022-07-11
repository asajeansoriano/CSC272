import java.io.File;
import java.util.Formatter;
import java.util.HashMap;

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

        //write to String output
        String output = "";
        
        //find every possible permutation of the seven-letter combination corresponding to that number and avoid digits 0 and 1
        
    }
}
