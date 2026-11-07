import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<String> listaDeCompras = new ArrayList<>();
        Scanner inUser = new Scanner(System.in);
        int opcao;

        do{
            System.out.println("""
                1- Adicionar Elemento *
                2- Remover Elemento *
                3- Visualizar Lista *
                4- Deletar Elemento ???
                5- Alterar Elemento *
                6- Deletar Lista *
                7- Sair *
                """);
                opcao = inUser.nextInt();
                inUser.nextLine();

                switch(opcao){
                    case 1 -> {
                        System.out.println("Insira um nome de um elemento pra adicionar");
                        String elementoAdicionado = inUser.nextLine();
                        listaDeCompras.add(elementoAdicionado);
                        System.out.println("Item adicionado");
                    }
                    case 2 -> {
                    System.out.println("Qual item você quer remover? ( Utilize o índice )");
                    for (String cachorro : listaDeCompras) {
                            System.out.println(listaDeCompras.indexOf(cachorro)+" - "+cachorro);
                        }
                    System.out.println("=====================");
                    int indiceRemover = inUser.nextInt();
                    inUser.nextLine();    
                    }
                    case 3 -> {
                        for (String elementos : listaDeCompras) {
                            System.out.println(listaDeCompras.indexOf(elementos)+" "+elementos);
                        }
                    }
                    case 4 -> {}
                    case 5 -> {
                        System.out.println("Qual elemento você quer alterar ( Escolha usando o índice )");
                        for (String cachorro : listaDeCompras) {
                            System.out.println(listaDeCompras.indexOf(cachorro)+" - "+cachorro);
                        }
                        System.out.println("=====================");
                        int indiceAlterar = inUser.nextInt();
                        inUser.nextLine();

                        System.out.println("Digite o nome do novo elemento");
                        String novoElemento = inUser.nextLine();

                        listaDeCompras.set(indiceAlterar, novoElemento);
                        System.out.println("Elemento alterado com sucesso");
                        System.out.println("=============================");

                    }
                    case 6 -> {
                        listaDeCompras.clear();
                        System.out.println("======A lista toda foi apagada======");
                    }
                    case 7 -> {System.out.println("======Programa Encerrado======");}
                    default -> {System.out.println("========Opção Inválida========");}
                }
        }while(opcao != 7);
    }
}
