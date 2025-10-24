public class Asiento {
    // Atributos
    int fila;
    int columna;
    boolean ocupado;
    double precio;

    // Método que muestra la información del asiento
    void mostrarInfo() {
        String estado = ocupado ? "X" : "O";
        System.out.println("Fila: " + fila + " | Columna: " + columna +
                           " | Precio: " + precio + " euros | Estado: " + estado);
    }

    // Método para ocupar el asiento
    void ocupar() {
        ocupado = true;
    }

    // Método principal
    public static void main(String[] args) {
        int filas = 3;
        int columnas = 4;

        Asiento[][] sala = new Asiento[filas][columnas];

        // Generar los asientos con datos aleatorios
        int i = 0;
        while (i < filas) {
            int j = 0;
            while (j < columnas) {
                sala[i][j] = new Asiento();
                sala[i][j].fila = i + 1;
                sala[i][j].columna = j + 1;
                sala[i][j].precio = Math.round((8 + Math.random() * 4) * 100.0) / 100.0; // entre 8 y 12 €
                //
                if (Math.random() < 0.3) {  
    			sala[i][j].ocupar(); 
                } 
                j++;
            }
            i++;
        }

        // Mostrar la información de cada asiento
        System.out.println("--- LISTADO DE ASIENTOS ---");
        i = 0;
        while (i < filas) {
            int j = 0;
            while (j < columnas) {
                sala[i][j].mostrarInfo();
                j++;
            }
            i++;
        }

        // Mostrar un mapa visual de la sala
        System.out.println("\n--- MAPA DE LA SALA ---");
        i = 0;
        while (i < filas) {
            int j = 0;
            while (j < columnas) {
                String estado = sala[i][j].ocupado ? "X" : "O";
                System.out.print(estado + " ");
                j++;
            }
            System.out.println(); // salto de línea por fila
            i++;
        }
    }
}
