import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner inUser = new Scanner(System.in);

        String nome, sobrenome;

        System.out.println("Qual seu nome?");
        nome = inUser.nextLine();

        System.out.println("Qual seu sobrenome?");
        sobrenome = inUser.nextLine();

        System.out.printf(" Olá %s %s, é um prazer te conhecer! ", nome, sobrenome);


        inUser.close();


    }
}
