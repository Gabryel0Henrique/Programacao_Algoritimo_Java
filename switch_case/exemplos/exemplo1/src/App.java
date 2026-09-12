import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner inUser = new Scanner(System.in);
        System.out.println("""
                escolha 1 numero

                1 - Domingo
                2- Segunda-Feira
                3-Terça-Feira
                4-Quarta-Feira
                5-Quinta-Feira
                6-Sexta-Feira
                7-Sábado
                """);
            int diaDaSemana = inUser.nextInt();

        switch(diaDaSemana){
            case 1: System.out.printf("Você escolheu %d, o dia da semana é Domingo\n",diaDaSemana);
            break;
            case 2: System.out.printf("Você escolheu %d, o dia da semana é Segunda-Feira\n",diaDaSemana);
            break;
            case 3: System.out.printf("Você escolheu %d, o dia da semana é Terça-Feira\n",diaDaSemana);
            break;
            case 4: System.out.printf("Você escolheu %d, o dia da semana é Quarta-Feira\n",diaDaSemana);
            break;
            case 5: System.out.printf("Você escolheu %d, o dia da semana é Quinta-Feira\n",diaDaSemana);
            break;
            case 6: System.out.printf("Você escolheu %d, o dia da semana é Sexta-Feira\n",diaDaSemana);
            break;
            case 7: System.out.printf("Você escolheu %d, o dia da semana é Sábado\n",diaDaSemana);
            break;
            default: System.out.printf("Opção Inválida\n");

            inUser.close();
        }
    }
}
