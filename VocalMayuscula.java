
import java.util.Scanner;
public class VocalMayuscula {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una vocal: ");
        char vocal = scanner.next().charAt(0);

        if ("aeiou".indexOf(Character.toLowerCase(vocal)) != -1) {
            System.out.println("La vocal en mayúscula es: " + Character.toUpperCase(vocal));
        } else {
            System.out.println("El carácter introducido no es una vocal.");
        }
    }
}
