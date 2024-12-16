package ListaNomes;

import java.util.Random;
import java.util.Scanner;

public class ListaNomes {
    Scanner entrada = new Scanner(System.in);
    private String nomes;
    private int id;
    public void cadastrar(){
        Random aleatorioId = new Random();
        nomes = entrada.nextLine();
        id= aleatorioId.nextInt();
        System.out.println(nomes+" "+id);
        
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
