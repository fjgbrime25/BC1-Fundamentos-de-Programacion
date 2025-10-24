import java.util.Scanner;

public class GestorNotas {
    // Variables públicas
    String[] nombres = new String[10];
    double[] notas = new double[10];
    int cantidadEstudiantes = 0;
    Scanner scanner = new Scanner(System.in);

    // Método principal
    public static void main(String[] args) {
        GestorNotas gestor = new GestorNotas();
        gestor.iniciarMenu();
    }

    // Método para iniciar el menú
    public void iniciarMenu() {
        int opcion;
        do {
            System.out.println("\n--- Menú de Gestión de Notas ---");
            System.out.println("1. Registrar estudiante");
            System.out.println("2. Calcular promedio y calificación");
            System.out.println("3. Mostrar estadísticas");
            System.out.println("4. Buscar estudiante");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del estudiante: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese la nota del estudiante (0-10): ");
                    double nota = scanner.nextDouble();
                    scanner.nextLine(); // Limpiar buffer
                    registrarEstudiante(nombre, nota);
                    break;
                case 2:
                    calcularPromedioYCalificacion(notas);
                    break;
                case 3:
                    mostrarEstadisticas();
                    break;
                case 4:
                    System.out.print("Ingrese el nombre del estudiante a buscar: ");
                    String nombreBuscado = scanner.nextLine();
                    buscarEstudiante(nombreBuscado);
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 5);
    }

    // Método para registrar un estudiante (recibe nombre y nota como parámetros)
    public void registrarEstudiante(String nombre, double nota) {
        if (cantidadEstudiantes >= 10) {
            System.out.println("Error: Máximo de estudiantes alcanzado (10).");
            return;
        }
        nombres[cantidadEstudiantes] = nombre;
        notas[cantidadEstudiantes] = nota;
        cantidadEstudiantes++;
        System.out.println("Estudiante registrado correctamente.");
    }

    // Método para calcular promedio y calificación (recibe un arreglo de notas como parámetro)
    public void calcularPromedioYCalificacion(double[] notas) {
        if (cantidadEstudiantes == 0) {
            System.out.println("No hay estudiantes registrados.");
            return;
        }
        double suma = 0;
        for (int i = 0; i < cantidadEstudiantes; i++) {
            suma += notas[i];
        }
        double promedio = suma / cantidadEstudiantes;
        System.out.printf("Promedio general: %.2f\n", promedio);

        // Determinar calificación
        String calificacion = (promedio >= 5) ? "Aprobado" : "Suspendido";
        System.out.println("Calificación general: " + calificacion);
    }

    // Método para mostrar estadísticas
    public void mostrarEstadisticas() {
        if (cantidadEstudiantes == 0) {
            System.out.println("No hay estudiantes registrados.");
            return;
        }
        double maxNota = notas[0];
        double minNota = notas[0];
        int aprobados = 0;
        int suspensos = 0;

        for (int i = 0; i < cantidadEstudiantes; i++) {
            if (notas[i] > maxNota) maxNota = notas[i];
            if (notas[i] < minNota) minNota = notas[i];
            if (notas[i] >= 6) aprobados++;
            else suspensos++;
        }

        System.out.println("--- Estadísticas ---");
        System.out.printf("Nota más alta: %.2f\n", maxNota);
        System.out.printf("Nota más baja: %.2f\n", minNota);
        System.out.println("Cantidad de aprobados: " + aprobados);
        System.out.println("Cantidad de suspensos: " + suspensos);
    }

    // Método para buscar un estudiante (recibe el nombre como parámetro)
    public void buscarEstudiante(String nombreBuscado) {
        if (cantidadEstudiantes == 0) {
            System.out.println("No hay estudiantes registrados.");
            return;
        }
        boolean encontrado = false;

        for (int i = 0; i < cantidadEstudiantes; i++) {
            if (nombres[i].equalsIgnoreCase(nombreBuscado)) {
                System.out.printf("Estudiante encontrado: %s, Nota: %.2f\n",
                                  nombres[i], notas[i]);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Estudiante no encontrado.");
        }
    }
}

// ***************************************************
//Mejora. Crear una clase Estudiante.
/*
public class Estudiante {
    String nombre;
    double nota;

    public Estudiante(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }
    
    public double getNota() {
        return nota;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setNota(double nota) {
        this.nota = nota;
    }
    public String toString() {
        return "Estudiante: " + nombre + ", Nota: " + nota;
    }
*/
// ***************************************************


