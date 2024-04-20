package ads.poo;

public class Autor {
    private String nome;
    private String nascionalidade;
    
    @Override
    public String toString() {
        return "Autor [nome=" + nome + ", nascionalidade=" + nascionalidade + "]";
    }

    public Autor(String nome, String nascionalidade) {
        this.nome = nome;
        this.nascionalidade = nascionalidade;
    }
}
