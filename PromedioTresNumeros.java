import java.util.Scanner;
public class PromedioTresNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Introduce el segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.print("Introduce el tercer número: ");
        double num3 = scanner.nextDouble();

        double promedio = (num1 + num2 + num3) / 3;
        System.out.println("El promedio de los tres números es: " + promedio);

        scanner.close();
    }
}  
