import java.util.Scanner;

public class exercio_15 {
    public static void main(String[] args) {
        Scanner scnaner = new Scanner(System.in);
        System.out.println("Digite o número: ");
        String numero = scnaner.nextLine();

        if (numero.length() == 2) {
            String primeiro = numero.substring(0, 1);
            System.out.println(primeiro);

        }else{
            int numero2 = Integer.parseInt(numero);
            if(numero2 == 1){
                System.out.println("Um");
            }else if (numero2 == 2){
                System.out.println("Dois");
            }else if(numero2 == 3){
                System.out.println("Três");
            }else if(numero2 == 4){
                System.out.println("Quatro");
            }else if(numero2 == 5){
                System.out.println("Cinco");
            }
        }

    }
}
