import java.util.Scanner;

public class exercicio_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Digite seu e-mail: ");
        String email = scanner.nextLine();

        Boolean valido;
        Boolean valido_Ultimo;
        Boolean valido_primeiro;
        Boolean ponto_apos;

        if(email.contains("@") && email.contains(".")){

            if(email.indexOf(".") != 0){ //Verificar se tem o ponto
                valido = true;
            }else{
                valido = false;
            }

            int local_PrimeiroPonto = email.indexOf(".");
            int local_Primeiro = email.indexOf("@");

            int local_UltimoPonto= email.lastIndexOf(".");
            int local_Ultimo = email.lastIndexOf("@");
            int tamanho = email.length();


            if((local_UltimoPonto != tamanho -1 ) && (local_Ultimo != tamanho - 1)){ //Verificar o ultimo caracter
                valido_Ultimo = true;
            }else{
                valido_Ultimo = false;
            }

            if(local_PrimeiroPonto != 0 || local_Primeiro != 0 ){ //Verificar o primeiro caracter
                valido_primeiro = true;
            }else{
                valido_primeiro = false;
            }

            String verificando = email.substring(local_Primeiro + 1, local_UltimoPonto -1);
            if(verificando.equals(".") ){
                ponto_apos = true;

            }else{
                ponto_apos = false;
            }


            if(valido && valido_Ultimo && valido_primeiro && ponto_apos ){
                System.out.println("E-mail válido");
            }else{
                System.out.println("E-mail inválido");
            }
        }else{
            System.out.println("E-mail inválido");
        }

    }
}
