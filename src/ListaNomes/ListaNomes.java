package ListaNomes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaNomes {
    Scanner entrada = new Scanner(System.in);
    private String nomes;
    private int id;
    public void cadastrar(){
        List<Integer>numeroAleatorio = new ArrayList<Integer>();
        nomes = entrada.nextLine();
        numeroAleatorio.stream().sequential();
        System.out.println(nomes);
        
    }

    @Override
    public String toString() {
        return "ListaNomes [nomes=" + nomes + ", id=" + id + "]";
    }
    public String getNomes() {
        return nomes;
    }
    public void setNomes(String nomes) {
        this.nomes = nomes;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}
