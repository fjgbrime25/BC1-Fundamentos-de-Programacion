import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer dos números enteros
        System.out.print("Introduce el primer número entero: ");
        int num1 = scanner.nextInt();
        System.out.print("Introduce el segundo número entero: ");
        int num2 = scanner.nextInt();

        // Realizar operaciones
        System.out.printf("Suma: %d\n", num1 + num2);
        System.out.printf("Resta: %d\n", num1 - num2);
        System.out.printf("Multiplicación: %d\n", num1 * num2);

        // División con manejo de división por cero
        if (num2 != 0) {
            System.out.printf("División: %.2f\n", (double) num1 / num2);
        } else {
            System.out.println("División: No se puede dividir por cero.");
        }

        scanner.close();
    }
}
