public class SumaDiagonalesMatriz {
    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 1},
            {4, 5, 6},
            {7, 8, 9}
        };

        int sumaPrincipal = 0;
        int sumaSecundaria = 0;
        int n = matriz.length;

        for (int i = 0; i < n; i++) {
            sumaPrincipal += matriz[i][i];
            sumaSecundaria += matriz[i][n - 1 - i];
        }

        System.out.println("Suma de la diagonal principal: " + sumaPrincipal);
        System.out.println("Suma de la diagonal secundaria: " + sumaSecundaria);
    }
}
