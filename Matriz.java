import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros ={2, 4, 8, 16, 32, 64, 128};
       
        // muestra array
        /*
        for (int i=0;i<numeros.length;i++){
            System.out.print(numeros[i] + " ");
        }
            */

        int inicio = 0;

        while (inicio < numeros.length) {
            System.out.print(numeros[inicio] + " ");
            inicio++;            
        } 

        int resultado = sumaElementos(numeros);
        int maxNumero = maximoElemento(numeros);
        int minNumero = minimoElemento(numeros);
        System.out.println("");
        System.out.println("La suma de elementos del array es: " + resultado);
        System.out.println("El maximo elemento del array es " + maxNumero);
        System.out.println("El minimo elemento del array es " + minNumero);
        
        scanner.close();
    }

    public static int sumaElementos(int[] num) {
        int suma = 0;
        for (int i = 0; i < num.length; i++) {
            suma += num[i];
        }
        return suma;
    }

    public static int maximoElemento(int[] num) {
        int maxNum = num[0];
        for (int i = 1; i < num.length;i++) {
            if (maxNum < num[i]) {
                maxNum = num[i];
            }
        }
        return maxNum;
    }

    public static int minimoElemento(int[] num) {
        int minNum = num[0];
        for (int i = 1; i < num.length;i++) {
            if (minNum > num[i]) {
                minNum = num[i];
            }
        }
        return minNum;
    }
}