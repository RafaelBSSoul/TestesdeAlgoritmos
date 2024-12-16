import java.util.ArrayList;
import java.util.List;

import ListaNomes.ListaNomes;

public class App {
    public static void main(String[] args) throws Exception {
List<ListaNomes>nomes = new ArrayList<ListaNomes>();
ListaNomes nomePessoa = new ListaNomes(); 

nomePessoa.cadastrar();
nomePessoa.cadastrar();

nomes.add(nomePessoa);

System.out.println(nomes);
}
}
