import java.util.Scanner;
import java.util.ArrayList;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner inUser = new Scanner(System.in);
        ArrayList<String> filmesArrayList = new ArrayList<>();
        int opcao;

        do{
            System.out.println("""
                ======Menu de Filmes======
                1- Cadastrar um novo filme ou série
                2- Visualizar todos os títulos cadastrados
                3- ALterar um título da lista
                4- Excluir um título da lista
                5- Sair""");
                opcao = inUser.nextInt();
                inUser.nextLine();

                switch (opcao) {
                    case 1 -> {
                        System.out.println("Digite o Nome do Título");
                        String filmeAdicionar = inUser.nextLine();
                        filmesArrayList.add(filmeAdicionar);
                        if(filmesArrayList.contains(filmeAdicionar)){
                            System.out.println("Título Adicionado!");
                        }
                        System.out.println("========================");
                    }
                    case 2 -> {
                        if(filmesArrayList.isEmpty()){
                            System.out.println("A lista está vazia");
                        }else{
                            for(String filmes : filmesArrayList){
                            System.out.println(filmes);
                        }
                        }
                    }
                    case 3 -> {
                        if (filmesArrayList.isEmpty()) {
                            System.out.println("Nada foi Cadastrado Ainda");
                        }else{
                            System.out.println("Escolha o Título a ser Alterado ( Escolha o Índice )");
                            for(String filmes : filmesArrayList){
                                System.out.println(filmesArrayList.indexOf(filmes)+" - "+filmes);
                            }
                            int indiceSubstituir = inUser.nextInt();
                            inUser.nextLine();
                            System.out.println("Digite o Nome do Novo Título");
                            String novoTitulo = inUser.nextLine();
                            filmesArrayList.set(indiceSubstituir, novoTitulo);
                            if(filmesArrayList.contains(novoTitulo)){
                                System.out.println("Título Alterado com Sucesso");
                            }
                        }
                    }
                    case 4 -> {
                        if (filmesArrayList.isEmpty()) {
                            System.out.println("Nada foi Cadastrado Ainda");
                        }else{
                            System.out.println("===Escolha o Índice para Excluir o Título da Lista===");
                        for(String filmes : filmesArrayList){
                            System.out.println(filmesArrayList.indexOf(filmes)+" - "+filmes);
                            int indiceExcluir = inUser.nextInt();
                            inUser.nextLine();
                            filmesArrayList.remove(indiceExcluir);
                            if(!(filmesArrayList.contains(filmes))){
                                System.out.println("Título Excluído com Sucesso");
                            }
                        }
                        }
                        }
                    case 5 -> {System.out.println("===Sessão Encerrada===");}
                    default -> {System.out.println("Opção Inválida");}
                }
        }while(opcao!=5);
    }
}