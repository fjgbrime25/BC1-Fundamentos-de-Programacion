import java.util.InputMismatchException;
import java.util.Scanner;

public class DatosUsuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int edad = 0;
        double altura = 0.0;
        boolean entradaValida = false;        
        // Leer nombre completo
        System.out.print("Introduce tu nombre completo: ");
        String nombreCompleto = scanner.nextLine();

        // Leer edad
        while (!entradaValida) {
            System.out.print("Introduce tu edad: ");

            try {
            edad = scanner.nextInt();
            entradaValida = true;            
            } catch (InputMismatchException e) {
            System.out.println("Entrada no válida. Por favor, introduce un número entero.");
            scanner.nextLine(); // Limpiar el buffer
            }
        }

        // Leer altura
        entradaValida = false;
        while (!entradaValida) {
            System.out.print("Introduce tu altura: ");
            try {
            altura = scanner.nextDouble();
            entradaValida = true;            
            } catch (InputMismatchException e) {
            System.out.println("Entrada no válida. Por favor, introduce una altura correcta.");
            scanner.nextLine(); // Limpiar el buffer
            }
        }

        // Leer si estudia actualmente
        System.out.print("¿Estudias actualmente? (true/false): ");
        boolean estudia = scanner.nextBoolean();

        // Mostrar los datos con formato
        System.out.printf("\nNombre: %s\n", nombreCompleto.toUpperCase());
        System.out.printf("Edad: %d años\n", edad);
        System.out.printf("Altura: %.2f metros\n", altura);
        System.out.printf("¿Estudia?: %b\n", estudia);

        scanner.close();
    }
}
