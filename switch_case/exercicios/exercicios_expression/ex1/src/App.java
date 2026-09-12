import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner inUser = new Scanner(System.in);

        System.out.println("""
                Bem vindo, qual bilhete você quer comprar?
                1 - Ônibus Urbano
                2- Metrô
                3- Trem Intermunincipal
                4- Ônibus Rodoviário
                """);
        int passagem = inUser.nextInt();
        switch(passagem){


            case 1 -> {
                System.out.printf("Você escolheu a opção %d.\n",passagem);
                    System.out.println("Quantos bilhetes você quer? cada passagem custa R$4,40");
                    int quant = inUser.nextInt();
                    double preco = 4.4;
                    System.out.printf("Valor a pagar : RS%.2f\n",quant*preco);
            }

            case 2 -> {
                System.out.printf("Você escolheu a opção %d.\n",passagem);
                    System.out.println("Quantos bilhetes você quer? cada passagem custa R$5,00");
                      int quant = inUser.nextInt();
                      double preco = 5;
                      System.out.printf("Valor a pagar : RS%.2f\n",quant*preco);
            }

            case 3 -> {
                System.out.printf("Você escolheu a opção %d.\n",passagem);
                     System.out.println("Quantos bilhetes você quer? cada passagem custa R$6,50");
                      int quant = inUser.nextInt();
                      double preco = 6.5;
                      System.out.printf("Valor a pagar : RS%.2f\n",quant*preco);
            }

            case 4 -> {
                System.out.printf("Você escolheu a opção %d.\n",passagem);
                     System.out.println("Quantos bilhetes você quer? cada passagem custa R$12,00");
                      int quant = inUser.nextInt();
                      double preco = 12;
                      System.out.printf("Valor a pagar : RS%.2f\n",quant*preco);
            }
            default -> System.out.printf("Opção Inválida");
        }

        inUser.close();
    
    }
}
