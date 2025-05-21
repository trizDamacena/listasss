import java.util.Scanner;

public class exercicio_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a distância percorrida: ");
        double distancia = Double.parseDouble(scanner.nextLine());

        System.out.println("Digite o total de gasolina gasto: ");
        double litros = Double.parseDouble(scanner.nextLine());

        double consumo = distancia/litros;

        if(consumo < 8){
            System.out.println("Venda o carro!");
        }else if (consumo >= 8 && consumo <=12){
            System.out.println("Econômico");
        }else{
            System.out.println("Super econômico");
        }
    }
}
