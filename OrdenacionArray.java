
public class OrdenacionArray {
    public static void main(String[] args) {
        int[] numeros = {5, 2, 8, 1, 3};
        seleccionSort(numeros);

        System.out.print("Array ordenado: [");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]);
            if (i < numeros.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    private static void seleccionSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[min]) min = j;
            }
            int tmp = a[i];
            a[i] = a[min];
            a[min] = tmp;
        }
    }
}


