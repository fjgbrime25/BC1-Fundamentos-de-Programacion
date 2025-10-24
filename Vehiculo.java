import java.util.Scanner;
import java.time.Year;

public class Vehiculo {
    String marca;
    String modelo;
    int anioFabricacion;
    boolean tieneSeguro;

    void mostrarDatos() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año de Fabricación: " + anioFabricacion);
        System.out.println("Tiene seguro: " + (tieneSeguro ? "Sí" : "No"));
    }

    void antiguedadVehiculo() {
        int anioActual = Year.now().getValue();
        int antiguedad = anioActual - anioFabricacion;
        System.out.println("Antigüedad del vehículo: " + antiguedad + " años");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vehiculo[] flota = new Vehiculo[3];

        for (int i = 0; i < flota.length; i++) {
            flota[i] = new Vehiculo();

            System.out.print("Introduce la marca del vehículo " + (i + 1) + ": ");
            flota[i].marca = sc.nextLine();

            System.out.print("Introduce el modelo: ");
            flota[i].modelo = sc.nextLine();

            System.out.print("Introduce el año de fabricación: ");
            flota[i].anioFabricacion = sc.nextInt();

            System.out.print("¿Tiene seguro activo? (true/false): ");
            flota[i].tieneSeguro = sc.nextBoolean();
            sc.nextLine();

            System.out.println();
        }

        for (Vehiculo v : flota) {
            v.mostrarDatos();
            v.antiguedadVehiculo();
            System.out.println("---------------------------");
        }

        sc.close();
    }
}
