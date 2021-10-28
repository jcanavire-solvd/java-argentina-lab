package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int[] arr = {1, 9, 4, 8, 7, 1};
        boolean changeOrder = false;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
        while (!changeOrder) {
            changeOrder = true;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < arr[i - 1]) {
                    int aux;
                    aux = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = aux;
                    changeOrder = false;


                }
            }
        }
        System.out.println("----------------\n");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }

    }
}
