import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class exercicio_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor: ");
        double dinheiro = Double.parseDouble(scanner.nextLine());

        System.out.println("Deseja converter a moeda para:\n1 - Real\n2 - Dólar\n3 - Euro:");
        int opcao = Integer.parseInt(scanner.nextLine());

        switch (opcao){
            case 1:
                dinheiro *= 0.18;
                System.out.printf("Dinheiro convertido em real: %.2f", dinheiro);
                break;
            case 2:
                dinheiro *= 5.66;
                System.out.printf("Dinheiro convertido em dólar: %.2f", dinheiro);
                break;
            case 3:
                dinheiro *= 6.37;
                System.out.printf("Dinheiro convertido em euro: %.2f", dinheiro);
                break;
        }
    }
}
