import java.util.Scanner;

public class exercicio_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tempo que ficou no estaionamento");
        int hora = Integer.parseInt(scanner.nextLine());
        double valor;
        if(hora <=2 ){
            valor = hora *2.00;
            System.out.printf("A valor a se pagar é %.2f", valor);
        }else if(hora >= 3 && hora<=4){
            valor = hora * 1.40;
            System.out.printf("O valor a se pagar é %.2f", valor);
        }else{
            System.out.printf("O valor a se pagar é %d", hora);
        }
    }
}
