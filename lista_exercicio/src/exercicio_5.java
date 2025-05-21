import java.util.Scanner;

public class exercicio_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a sua idade: ");
        int idade = Integer.parseInt(scanner.nextLine());

        if(idade>= 18 && idade <=65){
            System.out.println("Eleitor Obrigatório.");
        }else if(idade >=16 && idade <18 || idade >65){
            System.out.println("Eleitor Fcaultativo.");
        }else{
            System.out.println("Não Eleitor.");
        }
    }
}
