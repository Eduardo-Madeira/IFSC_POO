package ads.poo;

public class Autor {
    private String nome;
    private String nascionalidade;
    
    @Override
    public String toString() {
        return String.format("Nome= %s, Nascionalidade= %s", nome, nascionalidade);
    }

    public Autor(String nome, String nascionalidade) {
        this.nome = nome;
        this.nascionalidade = nascionalidade;
    }
}
