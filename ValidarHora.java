import java.util.Scanner;
public class ValidarHora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la hora (0-23): ");
        int hora = scanner.nextInt();
        System.out.print("Introduce los minutos (0-59): ");
        int minuto = scanner.nextInt();
        System.out.print("Introduce los segundos (0-59): ");
        int segundo = scanner.nextInt();

        if (esHoraValida(hora, minuto, segundo)) {
            System.out.println("La hora es válida: " + String.format("%02d:%02d:%02d", hora, minuto, segundo));
        } else {
            System.out.println("La hora no es válida.");
        }
    }

    public static boolean esHoraValida(int hora, int minuto, int segundo) {
        return (hora >= 0 && hora < 24) &&
               (minuto >= 0 && minuto < 60) &&
               (segundo >= 0 && segundo < 60);
    }
}
