import java.util.Scanner;

public class ConversorDeBases {

    // Método para convertir decimal a binario, octal o hexadecimal
    public static String convertirDecimal(int numero, int base) {
        if (numero == 0) {
            return "0";
        }

        String digitos = "0123456789ABCDEF";
        String resultado = "";

        int num = numero;

        while (num > 0) {
            int residuo = num % base;
            resultado = digitos.charAt(residuo) + resultado;
            num = num / base;
        }

        return resultado;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número decimal: ");
        int numero = sc.nextInt();

        System.out.println("Convertir a:");
        System.out.println("1. Binario");
        System.out.println("2. Octal");
        System.out.println("3. Hexadecimal");
        System.out.print("Seleccione una opción: ");
        int opcion = sc.nextInt();

        String resultado = "";

        switch (opcion) {
            case 1:
                resultado = convertirDecimal(numero, 2);
                System.out.println("Número binario: " + resultado);
                break;
            case 2:
                resultado = convertirDecimal(numero, 8);
                System.out.println("Número octal: " + resultado);
                break;
            case 3:
                resultado = convertirDecimal(numero, 16);
                System.out.println("Número hexadecimal: " + resultado);
                break;
            default:
                System.out.println("Opción inválida.");
        }

        sc.close();
    }
}
