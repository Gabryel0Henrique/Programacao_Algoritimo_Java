import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<String> contatosArrayList = new ArrayList<>();
        Scanner inUser = new Scanner(System.in);
        int opcao;
       
        do{
             System.out.println("""
                1- Cadastrar Contato
                2- Sair
                """);
                opcao = inUser.nextInt();
                inUser.nextLine();

                switch (opcao) {
                    case 1 -> {
                        System.out.println("Escreva o nome do Contato");
                        String novoContato = inUser.nextLine();
                        contatosArrayList.add(novoContato);
                        System.out.println("Contato Adicionado!");
                        System.out.println("=======================");

                        System.out.println("Deseja buscar algum nome específico? use true/false");
                        boolean validarBusca = inUser.nextBoolean();
                        inUser.nextLine();

                        if(validarBusca){
                            System.out.println("Digite o nome do Contato");
                            String procurarContato = inUser.nextLine();
                            if (contatosArrayList.contains(procurarContato)) {
                                System.out.println("Contato Encontrado!!!");
                            }else{
                                System.out.println("Esse contato não está cadastrado");
                            }
                        }
                    }
                    case 2-> {System.out.println("Programa Encerrado");}
                    default -> {System.out.println("Opção Inválida");}
                }
        }while (opcao!=2);

    }
}
