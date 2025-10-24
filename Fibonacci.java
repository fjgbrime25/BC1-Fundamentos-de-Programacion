import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el orden de la sucesión de Fibonacci: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Por favor, introduce un número positivo mayor que cero.");
        } else {
            System.out.println("Sucesión de Fibonacci hasta el orden " + n + ":");
            for (int i = 0; i < n; i++) {
                System.out.print(fibonacci(i) + " ");
            }
        }

        scanner.close();
    }

    // Función para calcular el término Fibonacci en la posición n
    public static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
