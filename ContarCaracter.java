import java.util.Scanner;
public class ContarCaracter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una cadena: ");
        String cadena = scanner.nextLine();
        System.out.print("Introduce un carácter a buscar: ");
        char caracter = scanner.next().charAt(0);

        int contador = contarVecesCaracter(cadena, caracter);

        System.out.println("El carácter '" + caracter + "' aparece " + contador + " veces en la cadena.");
    }

    public static int contarVecesCaracter(String cadena, char caracter) {
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == caracter) {
                contador++;
            }
        }
        return contador;
    }
}