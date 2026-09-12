import java.util.Scanner;
public class App{
    public static void main(String[] args)throws Exception{
        Scanner inUser = new Scanner(System.in);
        System.out.println("""
            Escolha um serviço
            1 - Consultar Saldo
            2 - Sacar Dinheiro
            3 - Depositar Dinheiro
            4 - Encerrar Atendimento
        """);
        int opcao = inUser.nextInt();

        switch(opcao){

            case 1 -> {
                System.out.println("Seu dado é de R$1000,00 ( ficticio )");
            }
            case 2 -> {
                System.out.println("Quanto você tem de saldo?");
                double saldo = inUser.nextDouble();
                System.out.println("Quanto você quer sacar?");
                double saque = inUser.nextDouble();
                if(saque>saldo){
                    System.out.println("Impossivel sacar mais do que tem na conta");
                }else{
                    System.out.printf("Saque realizado com sucesso, novo saldo %.2f\n",saldo-saque);
                }
            }
            case 3 -> {
                System.out.println("Quanto você tem de saldo?");
                double saldo = inUser.nextDouble();
                System.out.println("Quanto você quer depositar?");
                double deposito = inUser.nextDouble();
                System.out.printf("Seu novo saldo é R$%.2f\n",saldo+deposito);
            }

            case 4 -> System.out.println("Atendimento Encerrado");
            default -> System.out.println("Opção Inválida");
        }
        

        inUser.close();
    }
}