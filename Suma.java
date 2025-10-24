//import java.util.Scanner;

import java.util.Scanner;

public class Suma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros ={1, 2, 3, 4};
        int suma = 0;

        for (int i=0;i<numeros.length;i++){
            //suma+ = numeros[i];
            suma = suma + numeros[i];
        }

        System.out.println("La suma es: " + suma);

        /*
        System.out.println("");
        System.out.print("La suma de ( ");

        for (int i=0;i<numeros.length;i++){
            System.out.print(numeros[i] + " ");
        }

        System.out.println(") es:"+ suma);
        
        //System.out.println("El último número es:" + numeros[numeros.length-1]);
        */
        
        //scanner.close();
    }
}