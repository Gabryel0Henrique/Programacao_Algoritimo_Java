import java.util.Scanner;
import java.util.ArrayList;
public class App {
    public static void main(String[] args) throws Exception {
        //Como declarar um ArrayList
        ArrayList<String> nomeArray = new ArrayList<>();

        //Métodos:
        //add() - adiciona elementos na lista ( nomeArray.add(elemento)  )
        nomeArray.add("bazinga");

        //get() - consulta um elemento (  nomeArray.get(indice) )
        System.out.println(nomeArray.get(0));

        //set() - substitui um elemento (  nomeArray.set(indiceAntigo, "elementoNovo")  )
        nomeArray.set(0, "ye");
        System.out.println(nomeArray.get(0));

        //remove() - remove um elemento (  nomeArray.remove(indice) )
        nomeArray.remove(0);
        System.out.println(nomeArray); // vai retornar [] por que apagou o unico elemento da lista
    
        //size() - retorna o tamanho da lista
        nomeArray.size();
    }
}
