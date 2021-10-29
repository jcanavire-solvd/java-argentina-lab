public class Sorting {
    static void quickSort(int[] numberList) {
        quickSort(numberList, 0, numberList.length - 1);
    }

    static void quickSort(int[] numberList, int start, int end) {

        if (end <= start) {
            return;
        }

        // declare the pivot
        int p = end;


        int i = start;
        while (i < p) {
            if (numberList[i] <= numberList[p]) {
                i++;
            } else {
                int pivot = numberList[p];
                numberList[p] = numberList[i];
                numberList[i] = numberList[p - 1];
                numberList[p - 1] = pivot;

                // Change the position of pivot
                p--;
            }
        }
        //here we set the lower part and the upper part
        quickSort(numberList, start, p - 1);
        quickSort(numberList, p, end);
    }

    public final static void main(String[] args) {
        int[] numberList = new int[args.length];

        System.out.println("Numbers inserted:");

        // check data type:
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i] + " ");
            numberList[i] = Integer.parseInt(args[i]);
        }

        System.out.println();
        quickSort(numberList);

        System.out.println("Ordered numbers:");

        for (int i = 0; i < numberList.length; i++) {
            System.out.print(numberList[i] + " ");
        }


    }


    }

