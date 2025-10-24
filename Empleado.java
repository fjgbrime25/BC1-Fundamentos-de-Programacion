import java.util.Scanner;

public class Empleado {
    // Atributos (sin encapsulación)
    String nombre;
    String puesto;
    double salarioBase;
    int aniosAntiguedad;
    boolean bonificacion;

    // Constructor
    public Empleado(String nombre, String puesto, double salarioBase, int aniosAntiguedad, boolean bonificacion) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.salarioBase = salarioBase;
        this.aniosAntiguedad = aniosAntiguedad;
        this.bonificacion = bonificacion;
    }

    // Método que calcula el salario final
    public double calcularSalarioFinal() {
        double salarioFinal = salarioBase;
        salarioFinal += salarioBase * 0.05 * aniosAntiguedad; // 5% por año
        if (bonificacion) {
            salarioFinal += salarioBase * 0.10; // Bonificación del 10%
        }
        return salarioFinal;
    }

    // Método para mostrar los datos del empleado
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Puesto: " + puesto);
        System.out.println("Años de antigüedad: " + aniosAntiguedad);
        System.out.println("Tiene bonificación: " + (bonificacion ? "Sí" : "No"));
        System.out.println("Salario base: " + salarioBase + " €");
        System.out.println("Salario final: " + calcularSalarioFinal() + " euros");
        System.out.println("----------------------------");
    }

    // Método estático para calcular el salario promedio de todos los empleados
    public static double calcularPromedio(Empleado[] lista) {
        double suma = 0;
        for (Empleado e : lista) {
            suma += e.calcularSalarioFinal();
        }
        return suma / lista.length;
    }

    // Método estático para contar los empleados con bonificación
    public static int contarConBonificacion(Empleado[] lista) {
        int contador = 0;
        for (Empleado e : lista) {
            if (e.bonificacion) {
                contador++;
            }
        }
        return contador;
    }

    // Método principal
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Empleado[] empleados = new Empleado[3];

        for (int i = 0; i < empleados.length; i++) {
            System.out.println("Introduce los datos del empleado " + (i + 1));

            System.out.print("Nombre: ");
            String nombre = sc.nextLine();

            System.out.print("Puesto: ");
            String puesto = sc.nextLine();

            System.out.print("Salario base (euros): ");
            double salarioBase = sc.nextDouble();

            System.out.print("Años de antigüedad: ");
            int anios = sc.nextInt();

            System.out.print("¿Tiene bonificación? (true/false): ");
            boolean bonificacion = sc.nextBoolean();
            sc.nextLine(); // limpiar buffer

            empleados[i] = new Empleado(nombre, puesto, salarioBase, anios, bonificacion);
            System.out.println();
        }

        System.out.println("------ Información de empleados ------");
        for (Empleado e : empleados) {
            e.mostrarDatos();
        }

        double promedio = Empleado.calcularPromedio(empleados);
        promedio = Math.round(promedio * 100.0) / 100.0; 
        int conBonificacion = Empleado.contarConBonificacion(empleados);

        System.out.println("Salario promedio: " + promedio + " €");
        System.out.println("Empleados con bonificación: " + conBonificacion);

        sc.close();
    }
}
