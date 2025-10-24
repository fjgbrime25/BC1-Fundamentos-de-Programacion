import java.util.Scanner;
import java.time.LocalDate;
public class MayorDeEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce tu año de nacimiento: ");
        int anho = scanner.nextInt();

        int anhoActual = LocalDate.now().getYear();

        if (anhoActual-anho>18){
            System.out.println("Eres mayor de edad");
        }
        else {
            System.out.println("No eres mayor de edad");
        }

        scanner.close();
    }
}
