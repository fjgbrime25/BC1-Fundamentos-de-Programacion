import java.util.Arrays;

public class CalculoEstadisticas {
    public static void main(String[] args) {
        double[] numeros = {5, 10, 15, 5, 25, 12};
        double promedio = calcularPromedio(numeros);
        double mediana = calcularMediana(numeros);
        System.out.println("Promedio: " + promedio);
        System.out.println("Mediana: " + mediana);
    }

    public static double calcularPromedio(double[] numeros) {
        double suma = 0;
        for (double num : numeros) {
            suma += num;
        }
        return suma / numeros.length;
    }

    public static double calcularMediana(double[] numeros) {
        Arrays.sort(numeros);
        if (numeros.length % 2 == 0) {
            return (numeros[numeros.length / 2 - 1] + numeros[numeros.length / 2]) / 2;
        } else {
            return numeros[numeros.length / 2];
        }
    }
}
