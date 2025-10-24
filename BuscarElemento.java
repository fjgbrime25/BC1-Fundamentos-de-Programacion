import java.util.Scanner;

public class BuscarElemento {
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
        System.out.println("Elemento:");
        int elemento = scanner.nextInt();
        int posicion = -1;

        for (int i=0;i<numeros.length;i++){
            System.out.print(numeros[i] + " ");
            if (numeros[i]==elemento){
                posicion=i+1;
            }
        }
        
        System.out.println("");
        if (posicion==-1) {
            System.out.println("El elemento " + elemento + " no se ha encontrado");
        }
        else {
            System.out.println("El elemento " + elemento + " se ha encontrado en la posición: " + posicion);
        }
        scanner.close();
    }
}