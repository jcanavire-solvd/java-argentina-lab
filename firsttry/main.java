import java.util.Arrays;

public class firstTry {
//--------

   public static String[] bubbleMethod(String[] array) { 
       
        for(int i=0; i < array.length; i++){ 
            for(int j=1; j < (array.length-i); j++){
                
                if(Integer.parseInt(array[j-1]) > Integer.parseInt(array[j])){ 
                    int flag = Integer.parseInt(array[j-1]);
                    array[j-1] = array[j];
                    array[j] = String.valueOf(flag);
                }
            }
        }
       return array;
       
   }

//-------
    public static void main(String... args) {
        if (args.length == 0) {
            System.out.println("Ingrese datos via cmd!");
        } 
            else {

                System.out.println("La cantidad de argumentos es: " + args.length);
                for (int i = 0; i < args.length; i++) {
                    System.out.println("Argumento N° " + Integer.parseInt(String.valueOf(i+1)) + ": " + args[i]);
                }
            
                String [] sortedArray = bubbleMethod(args); 
                System.out.println("argumentos bajo ordenamiento: " + Arrays.toString(sortedArray));
        }
    }
}