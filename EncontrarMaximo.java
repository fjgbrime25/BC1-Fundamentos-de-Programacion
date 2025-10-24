import java.util.Scanner;

public class EncontrarMaximo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //int[] numeros ={4, 7, 7, 8};
        int numeroPares = 0;
        
        int dimension;
        System.out.println("Dimensión del array:");

        dimension = scanner.nextInt();
        
        int[] numeros = new int[dimension];
                
        for (int i=0;i<dimension;i++){
            System.out.println("Valor:");
            numeros[i]=scanner.nextInt();
        }
        
        int maximo = numeros[0];
        int posicion = 1;

        for (int i=1;i<numeros.length;i++){
            if (numeros[i]>maximo){
               maximo=numeros[i];
               posicion=i+1;
            }
        }

        for (int i=0;i<numeros.length;i++){
            System.out.print(numeros[i] + " ");
        }

        System.out.println("");
        System.out.println("El máximo es: " + maximo + " y la posición: " + posicion);

        scanner.close();
    }
}