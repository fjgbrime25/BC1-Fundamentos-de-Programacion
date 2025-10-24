import java.util.Scanner;

public class ContarPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros ={4, 7, 7, 8};
        int numeroPares = 0;
        
        /*
        int dimension;
        System.out.println("Dimensión del array:");

        dimension = scanner.nextInt();
        
        int[] numeros = new int[dimension];
                
        for (int i=0;i<dimension;i++){
            System.out.println("Valor:");
            numeros[i]=scanner.nextInt();
        }
        
        */

        // cuenta el número de números pares
        for (int i=0;i<numeros.length;i++){
            System.out.print(numeros[i] + " ");            
            if (numeros[i]%2==0){
               numeroPares++;
            }
        }

        System.out.println("");
        System.out.println("El número de números pares es: " + numeroPares);

        //scanner.close();
    }
}