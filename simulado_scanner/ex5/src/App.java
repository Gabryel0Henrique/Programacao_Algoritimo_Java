import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner inUser = new Scanner(System.in);

        double real, dolar;
        dolar = 5.19;

        System.out.println("Quanto Reais você possui?");
        real = inUser.nextDouble();

 System.out.printf("Com R$%.2f você consegue comprar U$%.2f\n",real, real/dolar);

        inUser.close();
    }
}
