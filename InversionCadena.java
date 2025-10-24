import java.util.Scanner;
public class InversionCadena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una cadena de texto: ");
        String input = scanner.nextLine();
        
        String reversed = invertirCadena(input);
        System.out.println("Cadena invertida: " + reversed);
        
        scanner.close();
    }
    
    public static String invertirCadena(String str) {
        String resultado = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            resultado += str.charAt(i);
        }
        return resultado;
    }
}
