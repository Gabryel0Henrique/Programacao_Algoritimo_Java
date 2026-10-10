import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner inUser = new Scanner(System.in);

        System.out.println("Escolha um numero para pular");
        int numeroEscolhido = inUser.nextInt();

        for(int i=0; i<=100; i+=numeroEscolhido){
            System.out.println(i);
        }

        inUser.close();
    }
}
