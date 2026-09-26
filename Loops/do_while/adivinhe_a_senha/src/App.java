import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner inUser = new Scanner(System.in);

        int quantTentativa = 0;
        int tentativa = 0;
        System.out.println("Digite uma senha ( numeros inteiros )");
        int senha = inUser.nextInt();

        do{
            System.out.println("Digite a senha para entrar na sua conta");
            tentativa = inUser.nextInt();
            if(tentativa!=senha){
                System.out.println("Errrouuuuuuuuuuu");
            }
            quantTentativa = quantTentativa + 1;
        }
        while(senha!=tentativa);
        inUser.close();
        System.out.printf("Você acertou a senha em %d tentativas\n", quantTentativa);
    }
}
