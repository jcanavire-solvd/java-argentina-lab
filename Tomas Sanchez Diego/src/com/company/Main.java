package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] numArray = new int[4];
        Scanner sc= new Scanner(System.in);
        System.out.print("Insert the first number ");
        numArray[0] = sc.nextInt();
        System.out.print("Insert the second number ");
        numArray[1] = sc.nextInt();
        System.out.print("Insert the second number ");
        numArray[2] = sc.nextInt();
        System.out.print("Insert the second number ");
        numArray[3] = sc.nextInt();

        System.out.print("This are the numbers you typed in order of insertion ");
        PrintArray(numArray);
        numArray = BubbleSort(numArray);
        System.out.print("This are the numbers you typed in Ascending order ");
        PrintArray(numArray);
        }

        public static int[] BubbleSort ( int arr[]) {
            int n = arr.length;
            int temp = 0;
            for(int i=0; i < n; i++){
                for(int j=1; j < (n-i); j++){
                    if(arr[j-1] > arr[j]){
                        //swap elements
                        temp = arr[j-1];
                        arr[j-1] = arr[j];
                        arr[j] = temp;
                    }

                }
            }
            return arr;
        }


    public static void PrintArray(int arr[])
        {
            int n = arr.length;
            for (int i=0; i<n; ++i)
                System.out.print(arr[i] + " ");
            System.out.println();
        }

}

