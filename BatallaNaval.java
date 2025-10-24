import java.util.Scanner;
import java.util.Random;

public class BatallaNaval {
    private static final int TAMANIO_TABLERO = 5;
    private static final int NUM_BARCO = 3;
    private static char[][] tablero;
    private static int intentos;

    public static void main(String[] args) {
        inicializarJuego();
        jugar();
    }

    private static void inicializarJuego() {
        tablero = new char[TAMANIO_TABLERO][TAMANIO_TABLERO];
        for (int i = 0; i < TAMANIO_TABLERO; i++) {
            for (int j = 0; j < TAMANIO_TABLERO; j++) {
                tablero[i][j] = '~';
            }
        }
        colocarBarcos();
        intentos = 0;
    }

    private static void colocarBarcos() {
        Random random = new Random();
        for (int i = 0; i < NUM_BARCO; i++) {
            int fila;
            int col;
            do {
                fila = random.nextInt(TAMANIO_TABLERO);
                col = random.nextInt(TAMANIO_TABLERO);
            } while (tablero[fila][col] == 'B');
            tablero[fila][col] = 'B';
        }
    }

    private static void jugar() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            mostrarTablero();
            System.out.print("Ingrese fila (0-" + (TAMANIO_TABLERO - 1) + "): ");
            int fila = scanner.nextInt();
            System.out.print("Ingrese columna (0-" + (TAMANIO_TABLERO - 1) + "): ");
            int col = scanner.nextInt();
            intentos++;
            if (fila < 0 || fila >= TAMANIO_TABLERO || col < 0 || col >= TAMANIO_TABLERO) {
                System.out.println("Coordenadas inválidas. Intente de nuevo.");
            } else if (tablero[fila][col] == 'B') {
                System.out.println("¡Hit!");
                tablero[fila][col] = 'X';
                if (verificarVictoria()) {
                    mostrarTablero();
                    System.out.println("¡Felicidades! Ha hundido todos los barcos en " + intentos + " intentos.");
                    break;
                }
            } else if (tablero[fila][col] == '~') {
                System.out.println("Agua.");
                tablero[fila][col] = 'O';
            } else {
                System.out.println("Ya ha disparado aquí.");
            }
        }
        scanner.close();
    }

    private static boolean verificarVictoria() {
        for (int i = 0; i < TAMANIO_TABLERO; i++) {
            for (int j = 0; j < TAMANIO_TABLERO; j++) {
                if (tablero[i][j] == 'B') {
                    return false;
                }
            }
        }
        return true;
    }

    private static void mostrarTablero() {
        System.out.println("Tablero:");
        for (int i = 0; i < TAMANIO_TABLERO; i++) {
            for (int j = 0; j < TAMANIO_TABLERO; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }
}
