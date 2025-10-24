public class CuentaBancaria {
    String titular;
    double saldo;
    String numeroCuenta;

    public CuentaBancaria(String titular, String numeroCuenta) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0.0;
    }

    public void depositar(double cantidad) {
        this.saldo += cantidad;
        System.out.println("Se han depositado " + cantidad + " en la cuenta.");
    }

    public void retirar(double cantidad) {
        if (cantidad <= this.saldo) {
            this.saldo -= cantidad;
            System.out.println("Se han retirado " + cantidad + " de la cuenta.");
        } else {
            System.out.println("Fondos insuficientes.");
        }
    }

    public void mostrarSaldo() {
        System.out.println(this.titular + " tiene un saldo de " + this.saldo + " en la cuenta " +this.numeroCuenta);
    }

    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("Juan Perez", "123456789");
        cuenta.depositar(500.0);
        cuenta.retirar(200.0);
        cuenta.mostrarSaldo();
    }
}
