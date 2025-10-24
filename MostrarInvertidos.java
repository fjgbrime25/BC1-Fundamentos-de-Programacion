import java.util.Scanner;

public class MostrarInvertidos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //int[] numeros ={4, 7, 7, 8};

        int dimension;
        System.out.println("Dimensión del array:");

        dimension = scanner.nextInt();
        
        int[] numeros = new int[dimension];
        
        for (int i=0;i<dimension;i++){
            System.out.println("Valor:");
            numeros[i]=scanner.nextInt();
        }
        
        
        for (int i=numeros.length-1;i>=0;i--){
            System.out.print(numeros[i] + " ");
        }
        
        //System.out.println("El último número es:" + numeros[numeros.length-1]);
        scanner.close();
    }
}