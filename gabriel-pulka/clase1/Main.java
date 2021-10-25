public class Main {

    public static void burbuja(int numeros[]){

        int len = numeros.length;
        int i, j, aux;

        for (i=0; i<len; i++){
            for (j= i+1; j<len; j++){
                if (numeros[i] > numeros[j]){
                    aux = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = aux;
                }
            }
        }
    }

    public static void main(String args[]){

        int numericos[] = new int[args.length];
        if (numericos.length == 0){
            System.out.println("Ingresar numeros separados por espacios para su ordenamiento");
            return;
        }

        int i = -1;

        //convertimos a un array de integer para que lo ordene como numero y no alfabeticamente
        for (String valor : args){
            i++;
            //tambien validamos que no nos pasen un dato no numerico
            try {
                numericos[i] = Integer.parseInt(valor);
            } catch (NumberFormatException e){
                System.out.println("Los parametros deben ser de tipo numerico");
                return;
            }

        }

        burbuja(numericos);

        for (int valor : numericos){
            System.out.println(valor);
        }

    }

}
