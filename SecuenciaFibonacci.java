import java.util.Scanner;

public class SecuenciaFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int n = scanner.nextInt();
        scanner.close();

        int[] fibonacci = generarFibonacci(n);

        System.out.print("Secuencia de Fibonacci: ");
        for (int num : fibonacci) {
            System.out.print(num + " ");
        }
    }

    public static int[] generarFibonacci(int n) {
        if (n <= 0) return new int[0];
        int[] fib = new int[n];
        fib[0] = 0;
        if (n > 1) fib[1] = 1;
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib;
    }
}
