import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner inUser = new Scanner(System.in);

        System.out.println("""
                1 - Maçã
                2- Banana
                3- Laranja
                4- Uva
                5- Abacaxi
                """);
        int fruta = inUser.nextInt();
        switch(fruta){
            case 1 : System.out.printf("Você escolheu a opção %d. Você escolheu Maçã\n",fruta);
            break;
            case 2 : System.out.printf("Você escolheu a opção %d. Você escolheu Banana\n",fruta);
            break;
            case 3 : System.out.printf("Você escolheu a opção %d. Você escolheu Laranja\n",fruta);
            break;
            case 4 : System.out.printf("Você escolheu a opção %d. Você escolheu Uva\n",fruta);
            break;
            case 5 : System.out.printf("Você escolheu a opção %d. Você escolheu Abacaxi\n",fruta);
            break;
            default: System.out.printf("Opção Inválida");
        }

        inUser.close();
    
    }
}
