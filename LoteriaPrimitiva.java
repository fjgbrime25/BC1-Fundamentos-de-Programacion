import java.util.Random;
import java.util.Arrays;
public class LoteriaPrimitiva {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numeros = new int[6];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(49) + 1; // Números entre 1 y 49
        }

        Arrays.sort(numeros); // Ordenar los números

        System.out.println("Números para la lotería Primitiva: " + Arrays.toString(numeros));
    }
}
