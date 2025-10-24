import java.util.Scanner;

public class SumaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = 0;
        int suma = 0;
        int i;
        System.out.println("Introduce un numero (negativo para finalizar)");

        /*
        do{
            num=scanner.nextInt();
            if(num>=0){
                suma=suma+num;
                System.out.println("Introduce un numero (negativo para finalizar)");
            }
        }while(num>=0);
        */
        /* 
        System.out.println("Introduce un numero (negativo para finalizar)");
        num =scanner.nextInt();

        while (num>=0) {
            suma=suma+num;
            System.out.println("Introduce un numero (negativo para finalizar)");
            num=scanner.nextInt();
        }
        */
        for (i=0;num>=0;i++){
             if (num>=0){
                suma=suma+num;
                System.out.println("Introduce un numero (negativo para finalizar)");
                num=scanner.nextInt();
            }
        }
        System.out.println("La suma es:" +suma);
        System.out.println("El valor de i es: :" +(i-1));
        scanner.close();
    }
}