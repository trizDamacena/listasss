import java.util.Scanner;

public class exercicio_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Digite o primeiro lado do triângulo: ");
        int lado1 = Integer.parseInt(scanner.nextLine());

        System.out.println("Digite o segundo lado do triângulo: ");
        int lado2 = Integer.parseInt(scanner.nextLine());

        System.out.println("Digite o terceiro lado do triângulo: ");
        int lado3 = Integer.parseInt(scanner.nextLine());

        if(lado1 == lado2 && lado1 == lado3 && lado2 == lado3){
            System.out.println("Triângulo Equilátero");
        }else if(lado1 == lado2 || lado2 == lado3 || lado1==lado3){
            System.out.println("Trinângulo Isóceles");
        }else{
            System.out.println("Triângulo Escaleno.");
        }
    }
}
