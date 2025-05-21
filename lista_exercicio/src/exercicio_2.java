import java.util.Scanner;

public class exercicio_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num1 = Integer.parseInt(scanner.nextLine());

        System.out.println("Digite o segundo número: ");
        int num2 = Integer.parseInt(scanner.nextLine());

        int resultado = num1 + num2;

        if(resultado >= 20){
            resultado += 8;
            System.out.printf("O resultado é %d", resultado);
        }else{
            resultado -= 5;
            System.out.printf("O resultado é %d", resultado);
        }
    }
}
