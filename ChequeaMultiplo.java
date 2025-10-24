import java.util.Scanner;
public class ChequeaMultiplo{
    int dividendo;
    int divisor;

    public int chequear(){
        if (dividendo%divisor==0){
            System.out.println("El numero "+dividendo+" es divisible entre "+divisor);
        }else{
            System.out.println("El numero "+dividendo+" NO es divisible entre "+divisor);
        }
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        ChequeaMultiplo nuevo= new ChequeaMultiplo();

        System.out.println("Introduce el dividendo");
        nuevo.dividendo=scanner.nextInt();

        System.out.println("Introduce el divisor");
        nuevo.divisor=scanner.nextInt();

        nuevo.chequear();
        scanner.close();
    }
}