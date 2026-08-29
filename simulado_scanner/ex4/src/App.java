import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner inUser = new Scanner(System.in);

        double numero;
        System.out.println("Digite um numero ( real )");
        numero = inUser.nextDouble();

        System.out.printf("o dobro de %.2f é %.2f\na terça parte de %.2f é %.2f\n",numero, numero*2, numero, numero/3);

        inUser.close();
    }
}
