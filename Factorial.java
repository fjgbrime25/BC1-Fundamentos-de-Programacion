import java.util.Scanner;

public class Factorial {

    public static long factorial(int n) {
        long resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número entero no negativo: ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("El número debe ser no negativo.");
        } else {
            long fact = factorial(numero);
            System.out.println("El factorial de " + numero + " es: " + fact);
        }
        scanner.close();
    }
}
