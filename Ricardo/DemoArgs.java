package ca.demo.terminal;

/*
*Create a simple system.out app. Print info about the user that should be passed to the main function as a parameter. Compile and run the program from the command line using javac and java from JDK.
*Sorting algorithm implementation. Choose any from the list: Insertion sort, Selection sort, bubble sort, Merge sort, Quicksort.
*
 */

public class DemoArgs {

    public static void main(String[] args) {
        {
            int a[]=new int[20];
            int j,temp,i;
            for(i=0;i<args.length;i++)
            {
                a[i]=Integer.valueOf(args[i]);
            }
            System.out.println("Elements in the unsorted array are: ");
            for(i=0;i<args.length;i++)
            {
                System.out.println(a[i]+"\t");  //PRINTING UNSORTED ELEMENTS
            }
            for(i=0;i<args.length;i++)             //SORTING THE ELEMENTS IN ARRAY
            {
                for(j=0;j<args.length-i-1;j++)
                {
                    if(a[j]>a[j+1])
                    {
                        temp=a[j];
                        a[j]=a[j+1];
                        a[j+1]=temp;
                    }
                }

            }
            System.out.println("Sorted array elements are: ");
            for(i=0;i<args.length;i++)
            {
                System.out.println(a[i]+"\t");        ////PRINTING SORTED ELEMENTS
            }
        }
    }

}


