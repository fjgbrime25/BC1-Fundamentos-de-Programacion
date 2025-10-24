import java.util.Scanner;

public class Nombres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //String[] nombres = new String[3]; 
        
        int dimension;
        System.out.println("Dimensión del array:");

        dimension = scanner.nextInt();
        
        String[] nombres = new String[dimension];
        
        // limpia buffer
        scanner.nextLine();

        for (int i=0;i<nombres.length;i++){
            System.out.println("Valor:");
            nombres[i]=scanner.nextLine();
        }
        
        /* */
        for (int i=0;i<nombres.length;i++){
            System.out.print(nombres[i] + " ");
        }
        
        scanner.close();
    }
}