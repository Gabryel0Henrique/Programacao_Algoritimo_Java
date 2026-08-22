import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner inUser = new Scanner(System.in);

        double largura, comprimento, area;

        System.out.println("Qual a largura do terreno: ");
        largura = inUser.nextDouble();
        System.out.println("Qual o comprimento do terreno: ");
        comprimento = inUser.nextDouble();

        area = largura * comprimento;

        System.out.println("A area do terreno e: "+area+" m²");




        inUser.close();
    }
}
