import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

        Scanner inUser = new Scanner(System.in);

        String nome;
        double salario;

        System.out.println("Qual seu nome?");
        nome = inUser.nextLine();

        System.out.println("Qual seu salario?");
        salario = inUser.nextDouble();

        System.out.printf("Nome do Funcionário: %s, salario R$%.2f \n",nome,salario);
    
        inUser.close();
    }
}
