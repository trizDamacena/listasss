import java.util.Scanner;

public class exercicio_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a data DD/MM/YYYY");
        String data = scanner.nextLine();

        int ano = Integer.parseInt(data.substring(6));
        int mes = Integer.parseInt(data.substring(3,5));
        int dia = Integer.parseInt(data.substring(0,2));
        int dia_total;
        int dias_restantate;

        switch (mes){
            case 01:
                dias_restantate = 359 - dia;
                System.out.printf("Faltam %d dias até o natal.", dias_restantate);
                break;

            case 02:
                dia_total = 31 + dia;
                dias_restantate = 359 - dia_total ;
                System.out.printf("Faltam %d dias até o natal.", dias_restantate);
                break;
            case 03:
                dia_total = 60 + dia;
                dias_restantate = 359 - dia_total ;
                System.out.printf("Faltam %d dias até o natal.", dias_restantate);
                break;
            case 4:
                dia_total = 91 + dia;
                dias_restantate = 359 - dia_total;
                System.out.printf("Faltam %d dias até o natal.", dias_restantate);
                break;
            case 5:
                dia_total = 121 + dia;
                dias_restantate = 359 - dia_total;
                System.out.printf("Faltam %d dias até o natal.", dias_restantate);
                break;
            case 6:
                dia_total = 152 + dia;
                dias_restantate = 359 - dia_total;
                System.out.printf("Faltam %d dias até o natal.", dias_restantate);
                break;
            case 7:
                dia_total = 182 + dia;
                dias_restantate = 359 - dia_total;
                System.out.printf("Faltam %d dias até o natal.", dias_restantate);
                break;
            case 8:
                dia_total = 213 + dia;
                dias_restantate = 359 - dia_total;
                System.out.printf("Faltam %d dias até o natal.", dias_restantate);
                break;
            case 9:
                dia_total = 243 + dia;
                dias_restantate = 359 - dia_total; //certo
                System.out.printf("Faltam %d dias até o natal.", dias_restantate);
                break;
            case 10:
                dia_total = 274 + dia;
                dias_restantate = 359 - dia_total;
                System.out.printf("Faltam %d dias até o natal.", dias_restantate);
                break;
            case 11:
                dia_total = 304 + dia;
                dias_restantate = 359 - dia_total; //certo
                System.out.printf("Faltam %d dias até o natal.", dias_restantate);
                break;
            case 12:
                dias_restantate = 366;

                System.out.printf("Faltam %d dias até o natal.", dias_restantate);
                break;
            }
    }
}
