import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner inUser = new Scanner(System.in);
        double precoTv = 6634.05;
        double saldo = 0;

        System.out.println("Bem vindo(a) à sua conta nubank"); 
        do{
            System.out.printf("Vaquinha: %.2f / %.2f\n", precoTv, saldo);
            System.out.println("quanto você quer depositar?");
           double deposito = inUser.nextDouble();
           saldo += deposito;

           System.out.printf("Vaquinha: %.2f / %.2f\n", precoTv, saldo);
           
          if(saldo < precoTv){
            System.out.printf("ainda faltam R$%.2f para atingir sua meta\n", precoTv-saldo);
          }
           
        }
        while(saldo < precoTv);
        System.out.printf("Voce alcançou a meta da vaquinha, seu saldo atual é R$%.2f\n", saldo);
        inUser.close();
    }
}
