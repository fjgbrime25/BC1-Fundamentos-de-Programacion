import java.util.Scanner;
import java.util.Random;
public class InventarioProductos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        String[] productos = {"Manzanas", "Bananas", "Naranjas", "Peras", "Uvas"};
        int[] inventario = new int[productos.length];
        
        // Inicializar inventario con cantidades aleatorias
        for (int i = 0; i < inventario.length; i++) {
            inventario[i] = random.nextInt(100); // Cantidad entre 0 y 99
        }
        
        while (true) {
            System.out.println("Inventario de Productos:");
            for (int i = 0; i < productos.length; i++) {
                System.out.println((i + 1) + ". " + productos[i] + ": " + inventario[i]);
            }
            System.out.println("Seleccione un producto para actualizar su inventario (0 para salir): ");
            int opcion = scanner.nextInt();
            
            if (opcion == 0) {
                break;
            }
            
            if (opcion < 1 || opcion > productos.length) {
                System.out.println("Opción inválida. Intente de nuevo.");
                continue;
            }
            
            System.out.println("Ingrese la nueva cantidad para " + productos[opcion - 1] + ": ");
            int nuevaCantidad = scanner.nextInt();
            inventario[opcion - 1] = nuevaCantidad;
        }
        
        scanner.close();
    }
}



