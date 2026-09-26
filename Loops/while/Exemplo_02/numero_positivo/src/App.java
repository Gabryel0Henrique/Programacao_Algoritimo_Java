import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner inUser = new Scanner(System.in);
        int num = 1;
        int soma = 0;

        while(num!=0){
            System.out.println("""
                    Digite qualquer número positivo para continuar no Loop
                    Digite 0 para sair
                    """);
                num = inUser.nextInt();
                System.out.printf("\nVocê digitou %d\n", num);
                soma = soma + num;
        }
        System.out.printf("A soma dos valores digitados foi %d\n", soma);

        inUser.close();
    }
}
