import java.util.Scanner;

public class P3 {
    //Recursive Binary Search

    //recursiveBinarySearch performs binary search of an array
    //input: array, target, start, end
    //output: index of target in array or -1 if target is not in array

    public static void main(String[] args) {
        while(true) {
            Scanner in = new Scanner(System.in);
            int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            int start = 0;
            int end = array.length - 1;

            System.out.println("Array: ");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
            System.out.println("Enter a target integer: ");
            int target = Integer.parseInt(in.nextLine());
            System.out.println("Target: " + target);
            System.out.println("Start: " + start);
            System.out.println("End: " + end);

            int index = recursiveBinarySearch(array, target, start, end);
            if (index == -1) {
                System.out.println("Target not found.");
            } else {
                System.out.println("Target found at index " + index);
            }
            System.out.println("~~~~~~~~~");
            //in.close();
        }
    }

    public static int recursiveBinarySearch(int[] array, int target, int start, int end) {
        if (start > end) {
            return -1;
        } else {
            int mid = (start + end) / 2;
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] > target) {
                return recursiveBinarySearch(array, target, start, mid - 1);
            } else {
                return recursiveBinarySearch(array, target, mid + 1, end);
            }
        }
    }

}
