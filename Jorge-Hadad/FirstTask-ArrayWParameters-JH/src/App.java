import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(args);
        showArrayStr(args);
        
        String sCadena = "Esto es una cadena de texto";
        char[] aCaracteres = sCadena.toCharArray();

        System.out.println(aCaracteres);

        int[] test = new int[] {9,10,5,7,6,8,5,4,1};

        int [] testList = sorting(test);

        showArray(testList);

        String testString = "[1,2,356,678,3378]";
        
        String[] separatedStrings = testString.replaceAll("\\[", "")
            .replaceAll("]", "").split(",");
        
        int[] intArray = new int[separatedStrings.length];
        
        for (int i = 0; i < separatedStrings.length; i++) {
            
            try {
                intArray[i] = Integer.parseInt(separatedStrings[i]);
            } catch (Exception e) {
                System.out.println("Unable to parse string to int: " + e.getMessage());
            }
        }
        
        System.out.println(Arrays.toString(intArray));

        String str = "[1, 2, 3, 4, 5]";
        
        int[] arr = Arrays.stream(str.substring(1, str.length() - 1).split(","))
                .map(String::trim).mapToInt(Integer::parseInt).toArray();
                
        System.out.println(Arrays.toString(arr));

    }

/*1.Create a simple system.out app. Print info about the user that should be passed
 to the main function as a parameter. Compile and run the program from the command line using javac and java from JDK.
2.Sorting algorithm implementation. Choose any from the list: Insertion sort, 
Selection sort, bubble sort, Merge sort, Quicksort.*/
    public static int[] sorting (int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    /*show array*/
    public static void showArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void showArrayStr(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }


}
