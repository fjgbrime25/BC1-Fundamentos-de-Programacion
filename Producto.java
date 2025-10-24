import java.util.Scanner;

public class Producto {
    // Atributos
    String nombre;
    double precio;
    int stock;
    boolean enOferta;

    // Método que muestra la información del producto
    void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio + " euros");
        System.out.println("Stock: " + stock + " unidades");
        System.out.println("En oferta: " + enOferta);
        System.out.println("---------------------------");
    }

    // Método que aplica un descuento del 10% si el producto está en oferta
    void aplicarDescuento() {
        if (enOferta) {
            precio = precio * 0.9;
        }
    }

    // Método principal
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Producto[] lista = new Producto[4];

        int i = 0;
        while (i < lista.length) {
            System.out.println("=== Producto " + (i + 1) + " ===");
            lista[i] = new Producto();

            System.out.print("Nombre: ");
            lista[i].nombre = sc.nextLine();

            System.out.print("Precio: ");
            lista[i].precio = sc.nextDouble();

            System.out.print("Stock: ");
            lista[i].stock = sc.nextInt();

            System.out.print("¿Está en oferta (true/false)? ");
            lista[i].enOferta = sc.nextBoolean();
            sc.nextLine(); // limpiar salto de línea pendiente

            lista[i].aplicarDescuento();

            i++; // avanzar al siguiente producto
        }

        // Mostrar información de todos los productos
        System.out.println("\n--- LISTADO DE PRODUCTOS ---");
        i = 0;
        while (i < lista.length) {
            lista[i].mostrarInfo();
            i++;
        }

        sc.close();
    }
}
