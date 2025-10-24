import java.util.Scanner;

public class SumaArray {
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
        
        for (int i=0;i<numeros.length;i++){
            System.out.print(numeros[i] + " ");
        }

        int resultado = sumarElementosArray(numeros);
        
        System.out.println("La suma de elementos del array es: " + resultado);
        
        scanner.close();
    }

    public static int sumarElementosArray(int[] num) {
        int suma = 0;
        for (int i = 0; i < num.length; i++) {
            suma += num[i];
        }
        return suma;
    }
}