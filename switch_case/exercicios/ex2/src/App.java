import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner inUser = new Scanner(System.in);

        System.out.println("Escolha uma opção de jogo");
        int opcao = inUser.nextInt();

        switch(opcao){

            case 1: System.out.printf("Você escolheu %d. O jogo que você escolheu foi Minecraft",opcao);
            break;
            case 2: System.out.printf("Você escolheu %d. O jogo que você escolheu foi FIFA",opcao);
            break;
            case 3: System.out.printf("Você escolheu %d. O jogo que você escolheu foi Fortnite",opcao);
            break;
            case 4: System.out.printf("Você escolheu %d. O jogo que você escolheu foi Call of Duty",opcao);
            break;
            case 5: System.out.printf("Você escolheu %d. O jogo que você escolheu foi The Sims",opcao);
            break;
            default: System.out.println("Opção Inválida");
        }

        inUser.close();
    }
}
