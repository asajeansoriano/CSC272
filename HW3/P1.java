public class P1 {
    public static void main (String[] args) {
        Integer[] intArray = {5, 4, 3, 6, 2, 1, 7, 9, 8, 10};
        Float[] floatArray = {4.5f, 6.8f, 2.4f, 1.1f, 1.05f, 3.2f, 5.6f};
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < floatArray.length; i++) {
            System.out.print(floatArray[i] + " ");
        }
        System.out.println();
        selectionSort(intArray);
        selectionSort(floatArray);
        System.out.println("Selection Sort on integer array");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
        System.out.println("\nSelection Sort on float array");
        for (int i = 0; i < floatArray.length; i++) {
            System.out.print(floatArray[i] + " ");
        }
    }

    //generic method selectionSort that inputs, sorts, and outputs an integer array and a float array
    public static <T> void selectionSort(T[] inputArray) {
        // loop over inputArray.length - 1 elements      
        for (int i = 0; i < inputArray.length - 1; i++) {
            int smallest = i; // first index of remaining array

            // loop to find index of smallest element                      
            for (int index = i + 1; index < inputArray.length; index++) {
                T current = inputArray[index];
                T smallestValue = inputArray[smallest];
                if (current.toString().compareTo(smallestValue.toString()) < 0) {
                    smallest = index;                                        
                }                      
            }                               
                                                                       
        swap(inputArray, i, smallest); // swap smallest element into position
        printPass(inputArray, i + 1, smallest); // output pass of algorithm        
        }  
    }

       // helper method to swap values in two elements
    private static <T> void swap(T[] inputArray, int first, int second) {
        T temporary = inputArray[first]; // store first in temporary
        inputArray[first] = inputArray[second]; // replace first with second
        inputArray[second] = temporary; // put temporary in second
    }

    // print a pass of the algorithm
    private static <T> void printPass(T[] inputArray, int pass, int index) {
        System.out.printf("after pass %s: ", pass);

        // output elements till selected item
        for (int i = 0; i < index; i++) {
            System.out.printf("%s  ", inputArray[i]);
        }

        System.out.printf("%s* ", inputArray[index]); // indicate swap

        // finish outputting array
        for (int i = index + 1; i < inputArray.length; i++) {
            System.out.printf("%s  ", inputArray[i]);
        }

        System.out.printf("%n               "); // for alignment

        // indicate amount of array that�s sorted
        for (int j = 0; j < pass; j++) {
            System.out.print("--  ");
        }
        System.out.println(); 
    }
}
