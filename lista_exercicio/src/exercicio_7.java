import java.util.Scanner;

public class exercicio_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua altura: ");
        double altura = Double.parseDouble(scanner.nextLine());

        System.out.println("Digite seu peso: ");
        double peso = Double.parseDouble(scanner.nextLine());

        double IMC = peso / (altura*altura);

        if(IMC < 18.5){
            System.out.println("Abaixo do peso");
        }else if(IMC >= 18.5 && IMC < 25){
            System.out.println("Saudável");
        }else if(IMC >= 25 && IMC < 30){
            System.out.println("Sobrepeso");
        }else if(IMC>= 30 && IMC<35){
            System.out.println("Obesidade grau I");
        }else if(IMC >= 35 && IMC < 40){
            System.out.println("Obesidade grau II");
        }else if(IMC >= 40){
            System.out.println("Obesidade grau III");
        }
    }
}
