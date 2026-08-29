import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner inUser = new Scanner(System.in);

        int numero;

        System.out.println("Digite um numero ( inteiro )");
        numero = inUser.nextInt();
        System.out.printf("Numero escolhido: %d\nAntecessor: %d\nSucessor: %d \n",numero, numero-1, numero+1);


        inUser.close();


    }
}
