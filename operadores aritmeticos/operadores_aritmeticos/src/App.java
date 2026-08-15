public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("frase pra printar");
        double num1, num2, soma;
        num1 = 100;
        num2 = 10;
        soma = num1 + num2;

        System.out.println("a soma dos valores e: "+soma);
        System.out.println("Subtracao: "+(num2 - num1));
        System.out.println("multiplicacao: "+(num1*num2));
        System.out.println("divisao: "+(num1 / num2));
        System.out.println("porcentagem: "+(num1*(num2/100))+"%");
        System.out.println("MOD (resto da divisao): "+(num1%num2));
    }
}
