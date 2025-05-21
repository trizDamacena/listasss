import java.util.Scanner;

public class exercicio_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num1 = Integer.parseInt(scanner.nextLine());

        System.out.println("Digite o segundo número: ");
        int num2 = Integer.parseInt(scanner.nextLine());

        System.out.println("Digite o terceiro número: ");
        int num3 = Integer.parseInt(scanner.nextLine());

        if(num1>num2 && num1>num3 && num2>num3) {
            System.out.printf("1° MAIOR = %d\n2° MAIOR = %d\n3° MAIOR = %d", num1, num2, num3);
        }else if(num1>num2 && num1>num3 && num3>num2){
            System.out.printf("1° MAIOR = %d\n2° MAIOR = %d\n3° MAIOR = %d", num1, num3, num2);
        }

        if(num2>num1 && num2>num3 && num1>num3){
            System.out.printf("1° MAIOR = %d\n2° MAIOR = %d\n3° MAIOR = %d", num2, num1, num3);
        }else if(num2>num1 && num2>num3 && num3>num1){
            System.out.printf("1° MAIOR = %d\n2° MAIOR = %d\n3° MAIOR = %d", num2, num3, num1);
        }

        if(num3>num1 && num3>num2 && num1>num2){
            System.out.printf("1° MAIOR = %d\n2° MAIOR = %d\n3° MAIOR = %d", num3, num1, num2);
        }else if(num3>num1 && num3>num2 && num2>num1){
            System.out.printf("1° MAIOR = %d\n2° MAIOR = %d\n3° MAIOR = %d", num3, num2, num1);
        }
    }
}
