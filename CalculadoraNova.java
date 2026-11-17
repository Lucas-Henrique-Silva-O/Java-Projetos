import java.util.Scanner;

public class CalculadoraNova {

    public static void main(String[] args) {

        while(true){
            Scanner reader = new Scanner(System.in);

            System.out.println("Digite o primeiro número: ");
            int n1 = reader.nextInt();
            System.out.println("Digite o segundo número: ");
            int n2 = reader.nextInt();

            System.out.println("1 - ADIÇÃO");
            System.out.println("2 - SUBTRAÇÃO");
            System.out.println("3 - MULTIPLICAÇÃO");
            System.out.println("Digite sua escolha de operação: ");
            int choice = reader.nextInt();
            while(choice < 1 || choice > 3){
                System.out.println("Escolha inválida! 1 a 3!");
                choice = reader.nextInt();
            }

            if(choice == 1){
                int total = n1 + n2;
                System.out.printf("%d + %d = %d\n", n1, n2, total);
            }
            else if(choice == 2){
                int diferenca = n1 - n2;
                System.out.printf("%d - %d = %d\n", n1, n2, diferenca);
            }
            else{
                int produto = n1 * n2;
                System.out.printf("%d * %d = %d\n", n1, n2, produto);
            }
    

            System.out.println("Digite se deseja continuar (1 - SIM / 0 - NÃO) ");
            int resposta = reader.nextInt();
            while(resposta != 1 && resposta != 0){
                System.out.println("Resposa inválida! 0 ou 1!");
                System.out.println("Digite se deseja continuar (1 - SIM / 0 - NÃO) ");
                resposta = reader.nextInt();
            }

            if(resposta == 0){
                System.out.println("Encerrando...");
                break;
            }
            }
    
    }

    
}

