import java.util.Scanner;

public class exercicio_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do salário");
        double salario = Double.parseDouble(scanner.nextLine());

        double aumento;
        double new_salario;

        if(salario <= 3000){
            aumento = (salario*35)/100;
            new_salario = salario + aumento;
            System.out.printf("O salário novo é: %.2f", new_salario);
        }else{
            aumento = (salario*15)/100;
            new_salario = salario + aumento;
            System.out.printf("O salário novo é: %.2f", new_salario);
        }
    }
}
