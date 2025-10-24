public class Coche {
    String marca;
    String modelo;
    int año;
    int km;
    double litros; 

    public void encender() {
        System.out.println("El coche " + this.marca + " " + this.modelo + " está encendido.");
    }

    public void apagar() {
        System.out.println("El coche " + this.marca + " " + this.modelo + " está apagado.");
    }

    public void conducir(int kmRecorridos) {
        double litrosGastados = kmRecorridos * 0.08; // Supongamos 8 litros cada 100 km
        if (litrosGastados > this.litros) {
            System.out.println("No hay suficientes litros para conducir " + kmRecorridos + " kilómetros.");
        } else {
            this.km += kmRecorridos;
            this.litros -= litrosGastados;
            System.out.println("Conduciendo " + kmRecorridos + " kilómetros en el " + this.modelo + ". Se gastaron " + litrosGastados + " litros.");
        }
    }

    public void repostar(double litrosRepostados) {
        this.litros += litrosRepostados;
        System.out.println("Repostando " + litrosRepostados + " litros en el " + this.modelo + ". Ahora hay " + this.litros + " litros en el depósito.");
    }

    public void mostrarInformacion() {
        System.out.println("Coche: " + this.marca + " " + this.modelo + ", Año: " + this.año + ", Kilómetros recorridos: " + this.km + ", Litros en el depósito: " + this.litros);
    }

    public static void main(String[] args) {
        Coche coche = new Coche();
        coche.marca = "Toyota";
        coche.modelo = "Corolla";
        coche.año = 2020;
        coche.km = 10000;
        coche.litros = 60;
        coche.mostrarInformacion();
        coche.encender();
        coche.conducir(1000);
        coche.mostrarInformacion();
        coche.repostar(20.5);
        coche.mostrarInformacion();
        coche.apagar();
    }
}
