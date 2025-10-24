import java.util.Scanner;

public class CifradoCesar {
    private static final String ALFABETO = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final int DESPLAZAMIENTO = 3;

    public static String encriptar(String mensaje) {
        StringBuilder resultado = new StringBuilder();
        for (char c : mensaje.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                int nuevaPosicion = (c - base + DESPLAZAMIENTO) % 26 + base;
                resultado.append((char) nuevaPosicion);
            } else {
                resultado.append(c);
            }
        }
        return resultado.toString();
    }

    public static String desencriptar(String mensaje) {
        StringBuilder resultado = new StringBuilder();
        for (char c : mensaje.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                int nuevaPosicion = (c - base - DESPLAZAMIENTO + 26) % 26 + base;
                resultado.append((char) nuevaPosicion);
            } else {
                resultado.append(c);
            }
        }
        return resultado.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el mensaje a encriptar: ");
        String mensaje = scanner.nextLine();
        String mensajeEncriptado = encriptar(mensaje);
        System.out.println("Mensaje encriptado: " + mensajeEncriptado);
        System.out.println("Mensaje desencriptado: " + desencriptar(mensajeEncriptado));
    }
}
