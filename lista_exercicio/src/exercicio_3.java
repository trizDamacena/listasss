import java.util.Scanner;

public class exercicio_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número com três algaritmos: ");
        String numero = scanner.nextLine();

        String num1 = numero.substring(0,1);
        int numero1 = Integer.parseInt(num1);

        String num2 = numero.substring(1,2);
        int numero2 = Integer.parseInt(num2);

        String num3 = numero.substring(2);
        int numero3 = Integer.parseInt(num3);

        int resultado = numero1+numero2+numero3;

        System.out.printf("%s -> %d + %d + %d = %d",numero, numero1,numero2,numero3,resultado);


    }
}
