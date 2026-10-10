import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner inUser = new Scanner(System.in);

        System.out.println("Digite um numero");
        int num = inUser.nextInt();
        int mult = 0;
        int contador = 0;

        for(int i = 0; i<10; i++) {
        contador += 1;
        mult  = num * contador;
        System.out.printf("%d x %d = %d\n", num, contador, mult);
        }
        inUser.close();
        
    }
}
