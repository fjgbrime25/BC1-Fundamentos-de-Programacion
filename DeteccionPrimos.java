public class DeteccionPrimos {
    public static void main(String[] args) {
        int[] numeros = {2, 3, 4, 5, 10, 13, 16, 17, 18, 19};
        System.out.print("Números primos en el array: [");
        for (int i = 0; i < numeros.length; i++) {
            if (esPrimo(numeros[i])) {
                System.out.print(numeros[i]);
                if (i < numeros.length - 1) System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    private static boolean esPrimo(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
