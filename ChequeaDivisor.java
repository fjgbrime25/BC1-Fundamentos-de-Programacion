import java.util.Scanner;

public class ChequeaDivisor {
    public int numero; // atributo público para asignar directamente

    // Método que verifica si 'numero' es múltiplo de 'divisor'
    public boolean esMultiploDe(int divisor) {
        if (divisor == 0) {
            return false; // evitar división por cero
        }
        return (numero % divisor == 0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ChequeaDivisor checker = new ChequeaDivisor();

        System.out.print("Ingresa un número: ");
        checker.numero = scanner.nextInt();  // asignación directa sin setter

        System.out.print("Ingresa el número para verificar si es múltiplo: ");
        int divisor = scanner.nextInt();

        if (checker.esMultiploDe(divisor)) {
            System.out.println(checker.numero + " es múltiplo de " + divisor);
        } else {
            System.out.println(checker.numero + " NO es múltiplo de " + divisor);
        }

        scanner.close();
    }
}
