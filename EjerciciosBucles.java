import java.util.Scanner;

public class EjerciciosBucles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumaTotal = 0;
        int numero;
        do {
            System.out.print("Introduce un número (negativo para salir): ");
            numero = scanner.nextInt();
            if (numero >= 0) {
                sumaTotal += numero;
            }
        } while (numero >= 0);
        System.out.println("La suma total es: " + sumaTotal);
        scanner.close();
    }
}