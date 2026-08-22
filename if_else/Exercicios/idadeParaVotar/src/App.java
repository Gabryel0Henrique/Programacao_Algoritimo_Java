public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Idade para Votar:");
        int idade;
        idade = 17;

        System.out.println("Você tem: "+idade+" anos");
        if(idade>=16){System.out.println("Você pode votar");}
        else{System.out.println("Você nao pode votar");};
    }
}
