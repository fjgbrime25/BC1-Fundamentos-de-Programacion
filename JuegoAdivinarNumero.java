import java.util.Scanner;
import java.util.Random;

public class JuegoAdivinarNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(100) + 1; // Número entre 1 y 100
        int intento;
        int contadorIntentos = 0;

        System.out.println("¡Bienvenido al juego de adivinar el número!");
        System.out.println("Estoy pensando en un número entre 1 y 100. ¿Puedes adivinar cuál es?");

        do {
            System.out.print("Introduce tu intento: ");
            intento = scanner.nextInt();
            contadorIntentos++;

            if (intento < numeroSecreto) {
                System.out.println("El número secreto es mayor.");
            } else if (intento > numeroSecreto) {
                System.out.println("El número secreto es menor.");
            } else {
                System.out.println("¡Correcto! Has adivinado el número en " + contadorIntentos + " intentos.");
            }

        } while (intento != numeroSecreto);

        scanner.close();
    }
}