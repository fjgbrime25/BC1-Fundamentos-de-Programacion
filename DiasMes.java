import java.util.Scanner;

public class DiasMes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el número de mes (1-12): ");
        int mes = scanner.nextInt();
        int dias=0;

        // calculo los días

        if ((mes==1)||(mes==3)||(mes==5)||(mes==7)||(mes==8)||(mes==10)||(mes==12)){
            dias=31;
        }
        else if ((mes==4)||(mes==6)||(mes==9)||(mes==11)){
            dias=30;
            }
        else // el mes es febrero y supongo no bisiesto
            dias=28;

        if (mes==1){
            System.out.println("Enero tiene "+dias+" días");
        }

        if (mes==2){
            System.out.println("Febrero tiene "+dias+" días");
        }

        if (mes==3){
            System.out.println("Marzo tiene "+dias+" días");
        }

        if (mes==4){
            System.out.println("Abril tiene "+dias+" días");
        }

        if (mes==5){
            System.out.println("Mayo tiene "+dias+" días");
        }

        if (mes==6){
            System.out.println("Junio tiene "+dias+" días");
        }
        
        if (mes==7){
            System.out.println("Julio tiene "+dias+" días");
        }

        if (mes==8){
            System.out.println("Agost tiene "+dias+" días");
        }

        if (mes==9){
            System.out.println("Septiembre tiene "+dias+" días");
        }

        if (mes==10){
            System.out.println("Octubre tiene "+dias+" días");
        }

        if (mes==11){
            System.out.println("Noviembre tiene "+dias+" días");
        }

        if (mes==12){
            System.out.println("Diciembre tiene "+dias+" días");
        }


        /*
        switch (mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                dias = 31;
                break;
            case 4: case 6: case 9: case 11:
                dias = 30;
                break;
            case 2:
                dias = 28; // No se considera año bisiesto
                break;
            default:
                System.out.println("Mes inválido.");
                return;
        }

        String[] nombresMes = {
            "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
        };
        System.out.println(nombresMes[mes - 1] + " tiene " + dias + " días.");

        */
    }
}