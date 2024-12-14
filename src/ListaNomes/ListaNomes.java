package ListaNomes;

public class ListaNomes {
    private String nomes;
    private int id;
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
