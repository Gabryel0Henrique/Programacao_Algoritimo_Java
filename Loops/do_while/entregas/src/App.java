import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner inUser = new Scanner(System.in);

        double ganhoEntrega = 0;
        String app = "";
        double saldo = 0;
        double meta = 150.0;

        do{

            System.out.println("""
                Qual app você quer usar?
                1 - IFood
                2 - Rappi
                3 - Zé Delivery
                """);

            int opcaoApp = inUser.nextInt();

            switch(opcaoApp){
                case 1 -> {ganhoEntrega = 8.0;
                            app = "Ifood";
                }
                case 2 -> {ganhoEntrega = 9.0;
                            app = "Rappi";
                }
                case 3 -> {ganhoEntrega = 10.0;
                            app = "Zé Delivery";
                }
                default -> System.out.println("opçao invalida");
            }

            System.out.println("""
                Está chovendo?
                1 - Sim
                2 - Não
            """);

            int opcaoChuva = inUser.nextInt();

            switch (opcaoChuva) {
                case 1 -> {ganhoEntrega += 5;}
                case 2 -> {}
                default -> {System.out.println("opçao invalida");}
            }

           saldo += ganhoEntrega;

            System.out.printf("Você usou o %s\nGanhou %.2f nessa entrega\nSaldo total do dia: %.2f\nMeta: %.2f / %.2f\n", app ,ganhoEntrega ,saldo ,meta ,saldo );
        }

        while(saldo<meta);

            inUser.close();

    }
}
