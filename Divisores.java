import java.util.Scanner;

public class Divisores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt();
        int numeroDivisores = 0;

        System.out.println("Divisores de " + numero + ":");
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                System.out.print(i+" ");
                numeroDivisores++;
            }
        }
        System.out.println("");
        System.out.println("Número de divisores:" + numeroDivisores);
    }
}