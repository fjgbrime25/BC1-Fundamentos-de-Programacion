import java.util.Scanner;
public class InversoCaracteresString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un string: ");
        String input = scanner.nextLine();
        
        System.out.println("El contenido del string en orden inverso carácter a carácter es:");
        for (int i = input.length() - 1; i >= 0; i--) {
            System.out.print(input.charAt(i) + " ");
        }
    }
}
