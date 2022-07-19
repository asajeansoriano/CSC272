public class P3 {
    public static void main (String[] args) {
        //The Array Multiplier
        //a recursive program that outputs all combinations of each subarray in order given a 2D array

        //String[][] data = { {"A", "B"}, {"1", "2"}, {"XX", "YY"} };
        //String[][] data = { {"A"}, {"B"}, {"1"}, {"2"}, {"XX", "YY"} };
        String[][] data = {{"Try","Do"}, {"at least"}, {"1","3"}, {"Tasks", "Activity"}, {"a day","a week"} };
        StringBuilder sb = new StringBuilder();
        printCombinations(data, 0, 0, sb);
    }
    //recursive method to print all combinations of each subarray in order given a 2D array
    public static void printCombinations(String[][] data, int row, int col, StringBuilder sb) {
        if (row == data.length) {
            System.out.println(sb.toString());
            return;
        }
        for (int i = 0; i < data[row].length; i++) {
            sb.append(data[row][i] + " ");
            printCombinations(data, row + 1, i, sb);
            sb.delete(sb.length() - data[row][i].length() - 1, sb.length());
        }
    }
}
