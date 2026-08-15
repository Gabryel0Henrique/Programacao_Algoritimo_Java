public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Operadores Logicos");

        double nota = 6;
        int frequencia = 75;
        boolean result;

        /*
        Operador "and" = ambas condições verdadeiras ( && )
        Operador "or" pelo menos uma verdadeira ( || )
        Operador "not" nega a saida ( ! ) */

        System.out.println("\nOperador and");
        result = ((nota) >= 6 && frequencia >= 75);
        System.out.println(result);

        System.out.println("\nOperador or");
        result = ((nota) <= 4 || frequencia >= 75);
        System.out.println(result);

    
        System.out.println("\n"+result);
        System.out.println("\n"+!result);
        System.out.println("\n"+(!(result)));


    }
}
