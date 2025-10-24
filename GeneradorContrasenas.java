import java.util.Random;

public class GeneradorContrasenas {
    private static final String CARACTERES = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-+";
    private static final int LONGITUD_CONTRASENA = 12;

    public static String generarContrasena() {
        Random random = new Random();
        char[] contrasena = new char[LONGITUD_CONTRASENA];
        for (int i = 0; i < LONGITUD_CONTRASENA; i++) {
            int indice = random.nextInt(CARACTERES.length());
            contrasena[i] = CARACTERES.charAt(indice);
        }
        return new String(contrasena);
    }

    public static void main(String[] args) {
        String nuevaContrasena = generarContrasena();
        System.out.println("Nueva contraseña generada: " + nuevaContrasena);
    }
}
