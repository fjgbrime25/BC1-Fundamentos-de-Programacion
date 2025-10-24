public class SumaDiagonal {

    public static void main(String[] args) {
        int[][] matriz= {{2, 4, 8}, {3, 6, 9},{5, 10, 15}};

        System.out.println("La suma de la diagonal principal es: " + sumaDiagonalPrincipal(matriz));

    }

    public static int sumaDiagonalPrincipal(int[][] num) {
        int suma = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                if (i == j) {
                    suma += num[i][j];
                }
            }
        }
        return suma;
    }

}
