import java.util.Arrays;
import java.util.Scanner;
public class ComprobadorAnagramas {
    public static boolean sonAnagramas(String str1, String str2) {
        // Eliminar espacios y convertir a minúsculas
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // Si las longitudes son diferentes, no son anagramas
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convertir las cadenas a arreglos de caracteres y ordenarlos
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Comparar los arreglos ordenados
        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la primera palabra: ");
        String palabra1 = scanner.nextLine();
        System.out.print("Ingrese la segunda palabra: ");
        String palabra2 = scanner.nextLine();

        if (sonAnagramas(palabra1, palabra2)) {
            System.out.println("\"" + palabra1 + "\" y \"" + palabra2 + "\" son anagramas.");
        } else {
            System.out.println("\"" + palabra1 + "\" y \"" + palabra2 + "\" no son anagramas.");
        }

        scanner.close();
    }
}   