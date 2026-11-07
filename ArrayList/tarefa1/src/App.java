import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<String> tarefasArrayList = new ArrayList<>();
        Scanner inUser = new Scanner(System.in);
        int opcao;
       
        do{
             System.out.println("""
                1- Cadastrar Tarefa
                2- Remover Tarefa
                3- Sair
                """);
                opcao = inUser.nextInt();
                inUser.nextLine();

                switch (opcao) {
                    case 1 -> {
                        System.out.println("Digite a tarefa a ser Adicionada");
                        String novaTarefa = inUser.nextLine();
                        tarefasArrayList.add(novaTarefa);
                        System.out.println("Tarefa Adicionada!");
                        System.out.println("=======================");
                    }
                    case 2 -> {
                        System.out.println("Digite a tarefa a ser Removida");
                        String tarefaRemover = inUser.nextLine();

                        if(tarefasArrayList.contains(tarefaRemover)){
                            tarefasArrayList.remove(tarefaRemover);
                            System.out.println("Tarefa Removida");
                            System.out.println("=======================");
                            System.out.println("Lista Atualizada:");
                            for( String tarefa : tarefasArrayList ){
                                System.out.println(tarefa);
                            }
                        }else{
                            System.out.println("Essa Tarefa não está na lista");
                        }

                        
                    }
                    case 3-> {System.out.println("Programa Encerrado");}
                    default -> {System.out.println("Opção Inválida");}
                }
        }while (opcao!=3);

    }
}
