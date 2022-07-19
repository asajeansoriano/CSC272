import java.util.HashMap;
import java.util.Scanner;

public class P1 {
    // P1 - Word Frequency Count
    // program that reads line of text from user input and prints a table of the number of occurrences for each word in the text and ignores punctuation

    //The table where the key is the word (String) and the value is the count (Integer)
    static HashMap<String, Integer> wordCount = new HashMap<String, Integer>();

    //method to take a String and put each unique word in table "wordCount" and increase the value of each word by 1 if it's already in the table
    public static void putWords(String sentence) {
        //split on punctuation and white spaces
        String[] words = sentence.split("[\\p{Punct}\\s]+");
        for (String word : words) {
            word = word.toLowerCase();
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }
    }

    public static void main (String[] args) {
        //take string from input
        System.out.println("Enter your sentence.");
        Scanner in = new Scanner(System.in);
        String sentence = in.nextLine();
        putWords(sentence);
        //print the wordCount table
        System.out.println("Word\t\tCount");
        for (String word : wordCount.keySet()) {
            System.out.println(word + "\t\t" + wordCount.get(word));
        }
        in.close();
    }

}
