import java.util.Scanner;

public class exercicio_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Digite o valor da venda: ");
        double venda = Double.parseDouble(scanner.nextLine());

        if (venda >= 100.000){
            double porcentagem = (venda * 16) /100;
            double comissao = 700 + porcentagem;
            System.out.printf("Valor da comisão: %.2f", comissao);
        }else if (venda >= 80.000){
            double porcentagem = (venda * 16) /100;
            double comissao = 650 + porcentagem;
            System.out.printf("Valor da comisão: %.2f", comissao);
        }else if (venda >= 60.000){
            double porcentagem = (venda * 14) /100;
            double comissao = 600 + porcentagem;
            System.out.printf("Valor da comisão: %.2f", comissao);
        }else if (venda >= 40.000){
            double porcentagem = (venda * 14) /100;
            double comissao = 550 + porcentagem;
            System.out.printf("Valor da comisão: %.2f", comissao);
        }else{
            double porcentagem = (venda * 14) /100;
            double comissao = 500 + porcentagem;
            System.out.printf("Valor da comisão: %.2f", comissao);
        }
    }
}
