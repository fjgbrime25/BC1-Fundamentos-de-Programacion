//import java.time.LocalDate;
import java.util.Scanner;

public class EdadCien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer año de nacimiento y año actual
        System.out.print("Introduce tu año de nacimiento: ");
        int nacimiento = scanner.nextInt();
        
        System.out.print("Introduce año actual: ");
        int actual = scanner.nextInt();
        
        // Obtenemos el año actual
        //int actual = LocalDate.now().getYear();

        int edad = actual - nacimiento;

        System.out.printf("Tienes aproximadamente %d años.\n", edad);

        if (edad < 100) {
            System.out.printf("Te faltan %d años para cumplir 100 años.\n", 100 - edad);
        } else if (edad == 100) {
            System.out.println("¡Felicidades! ¡Este año cumples 100 años!");
        } else {
            System.out.println("¡Ya has cumplido 100 años o más! ¡Impresionante!");
        }

        scanner.close();
    }
}
