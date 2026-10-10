import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner inUser = new Scanner(System.in);
        
        System.out.println("Escreva um numero");
        int numeroEscolhido = inUser.nextInt();

        for(int i = 0; i<=numeroEscolhido; i++){
            System.out.println(i);
            Thread.sleep(1000);
        }

        System.out.println("Fim da contagem");
        inUser.close();


    }
}
