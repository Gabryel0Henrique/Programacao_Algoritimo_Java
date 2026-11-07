import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<String> nomesArrayList = new ArrayList<>();
        Scanner inUser = new Scanner(System.in);
        int opcao;
       
        do{
             System.out.println("""
                1- Cadastrar nome
                2- Mostrar lista em Ordem Alfabética
                3- Sair""");
                opcao = inUser.nextInt();
                inUser.nextLine();

                switch (opcao) {
                    case 1 -> {
                        System.out.println("Escreva o Nome a ser Adicionado");
                        String novoNome = inUser.nextLine();
                        nomesArrayList.add(novoNome);
                        System.out.println("Nome Adicionado!");
                        System.out.println("=======================");
                    }

                    case 2 ->{
                        Collections.sort(nomesArrayList);
                        for(String nomes : nomesArrayList){
                            System.out.println(nomes);
                        }
                        System.out.println("=======================");

                    }
                    
                    case 3-> {System.out.println("===Programa Encerrado===");}
                    default -> {System.out.println("===Opção Inválida===");}
                }
        }while (opcao!=3);

    }
}
