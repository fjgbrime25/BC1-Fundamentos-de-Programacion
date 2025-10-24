import java.util.Scanner;

public class CajeroAutomatico {
    private String titular;
    private String numeroCuenta;
    private double saldo;
    private final String pin;

    public CajeroAutomatico(String titular, String numeroCuenta, String pin, double saldoInicial) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.pin = pin;
        this.saldo = Math.max(0, saldoInicial);
    }

    public boolean autenticar(String intento) {
        return pin != null && pin.equals(intento);
    }

    public double consultarSaldo() {
        return saldo;
    }

    public boolean depositar(double cantidad) {
        if (cantidad <= 0) return false;
        saldo += cantidad;
        return true;
    }

    public boolean retirar(double cantidad) {
        if (cantidad <= 0 || cantidad > saldo) return false;
        saldo -= cantidad;
        return true;
    }

    public void mostrarInformacionCuenta() {
        System.out.printf("%s - Cuenta: %s%n", titular, numeroCuenta);
    }

    public void iniciarSesionYMostrarMenu() {
        Scanner sc = new Scanner(System.in);
        int intentos = 3;
        while (intentos > 0) {
            System.out.print("Ingrese PIN: ");
            String entrada = sc.nextLine().trim();
            if (autenticar(entrada)) break;
            intentos--;
            System.out.println("PIN incorrecto. Intentos restantes: " + intentos);
            if (intentos == 0) {
                System.out.println("Acceso bloqueado.");
                sc.close();
                return;
            }
        }

        boolean salir = false;
        while (!salir) {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Retirar");
            System.out.println("3. Depositar");
            System.out.println("4. Mostrar información de la cuenta");
            System.out.println("5. Salir");
            System.out.print("Seleccione opción: ");

            String opcion = sc.nextLine().trim();
            switch (opcion) {
                case "1":
                    System.out.printf("Saldo actual: %.2f%n", consultarSaldo());
                    break;
                case "2":
                    System.out.print("Ingrese monto a retirar: ");
                    try {
                        double montoR = Double.parseDouble(sc.nextLine().trim());
                        if (retirar(montoR)) {
                            System.out.printf("Retiro exitoso: %.2f. Nuevo saldo: %.2f %n", montoR, consultarSaldo());
                        } else {
                            System.out.println("Retiro fallido: monto inválido o fondos insuficientes.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Entrada no válida.");
                    }
                    break;
                case "3":
                    System.out.print("Ingrese monto a depositar: ");
                    try {
                        double montoD = Double.parseDouble(sc.nextLine().trim());
                        if (depositar(montoD)) {
                            System.out.printf("Depósito exitoso: %.2f. Nuevo saldo: %.2f %n", montoD, consultarSaldo());
                        } else {
                            System.out.println("Depósito fallido: monto inválido.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Entrada no válida.");
                    }
                    break;
                case "4":
                    mostrarInformacionCuenta();
                    System.out.printf("Saldo: %.2f %n", consultarSaldo());
                    break;
                case "5":
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        }
        System.out.println("Gracias por usar el cajero. Hasta luego.");
        sc.close();
    }

    public static void main(String[] args) {
        CajeroAutomatico cajero = new CajeroAutomatico("Juan Perez", "123456789", "1234", 500.0);
        cajero.iniciarSesionYMostrarMenu();
    }
}