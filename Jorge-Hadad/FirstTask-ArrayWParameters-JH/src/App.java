import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(args);

        String [] testListStr = sortingStr(args);

        showArrayStr(testListStr);
    }

/*1.Create a simple system.out app. Print info about the user that should be passed
 to the main function as a parameter. Compile and run the program from the command line using javac and java from JDK.
2.Sorting algorithm implementation. Choose any from the list: Insertion sort, 
Selection sort, bubble sort, Merge sort, Quicksort.*/
    public static String[] sortingStr (String[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (Integer.parseInt(array[i]) > Integer.parseInt(array[j])) {
                    int temp = Integer.parseInt(array[i]);
                    array[i] = array[j];
                    array[j] = String.valueOf(temp);
                }
            }
        }
        return array;
    }



    public static void showArrayStr(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }


}
