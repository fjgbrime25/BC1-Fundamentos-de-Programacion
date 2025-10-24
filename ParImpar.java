import java.util.Scanner;
public class ParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt();
        
        if (numero==0){
            System.out.println("El número es 0");
        }
        else if(numero % 2 == 0) {
            System.out.println("El número es par.");
        } else {
            System.out.println("El número es impar.");
        }
        
        scanner.close();
    }
}
