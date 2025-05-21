import java.util.Scanner;

public class exercicio_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.printf("Digite um número: ");
        int numero = Integer.parseInt(scanner.nextLine());

        if (numero % 3 == 0){
            System.out.printf("O número %d  é multiplo de 3.", numero);
        }else{
            System.out.printf("O número %d não é multiplo de 3.", numero);
        }
    }
}
