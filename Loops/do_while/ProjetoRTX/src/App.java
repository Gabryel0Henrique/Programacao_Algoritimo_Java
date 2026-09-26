import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner inUser = new Scanner(System.in);
        double meta = 1850.0;
        double saldo = 0;
        double valorRecebido = 0;

        do{
            System.out.println("""
                Qual Serviço Você Escolherá?
                1 - Formatação de PC e Backup (R$ 150,00)
                2 - Configuração de Roteador/Rede (R$ 200,00)
                3 - Criação de Landing Page em HTML/CSS (R$ 500,00)
                """);
                int opcaoFreela = inUser.nextInt();

                switch (opcaoFreela) {
                    case 1 -> {valorRecebido = 150.0;}
                    case 2 -> {valorRecebido = 200.0;}
                    case 3 -> {valorRecebido = 500.0;}
                    default -> System.out.println("Opção Inválida");
                }

                System.out.println("""
                    Qual a forma de pagamento?
                    1 - Pix
                    2 - Cartão
                """);
                int opcaoPagamenmto = inUser.nextInt();


                 switch (opcaoPagamenmto) {
                    case 1 -> {}
                    case 2 -> {valorRecebido -= 10;}
                    default -> System.out.println("Opção Inválida");
                }

                saldo = saldo + valorRecebido;

                System.out.printf("""
                        Valor Depositado: %.2f
                        Total Acumulado: %.2f
                        Meta: %.2f / %.2f\n
                        """,valorRecebido, saldo, meta, saldo);
        }

        while(saldo < meta);
            
        inUser.close();
    }
}
