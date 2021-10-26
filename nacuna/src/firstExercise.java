import java.util.Arrays;

public class firstExercise {

   public static String[] bubbleSort(String[] array) { // Logic behind bubbleSort implementation is to compare the current element with the next one of the array*/
        for(int i=0; i < array.length; i++){ // The First 'for' is to iterate inside the length of the initial array
            for(int j=1; j < (array.length-i); j++){ // Second 'for' starts counting from index 1 instead of 0, since we'll be comparing between the value of two consecutive index from the array.
                if(Integer.parseInt(array[j-1]) > Integer.parseInt(array[j])){ // needs to .parseInt to be able to compare when one value is bigger than the other
                    //swap elements
                    int temp = Integer.parseInt(array[j-1]);
                    array[j-1] = array[j];
                    array[j] = String.valueOf(temp);
                }

            }
        }
       return array; // as bubbleSort is not a void method it needs to return something.
   }


    public static void main(String... args) {

        if (args.length == 0) {
            System.out.println("Please input via cmd at least two parameters (Example: 'java firstExercise 2 6')");
        } else {

            System.out.println("Amount of Arguments: " + args.length);
            for (int i = 0; i < args.length; i++) {
                System.out.println("Argument number " + Integer.parseInt(String.valueOf(i+1)) + ": " + args[i] + "; "); // Integer.parseInt implemented just to start counting from 1

            }
            String [] sortedArray = bubbleSort(args); // specifies a new array called "sortedArray" that uses the static bubbleSort method
            System.out.println("Sorted arguments: " + Arrays.toString(sortedArray)); // needs the .toString method to be able to see a legible array in the terminal.
        }
    }
}

