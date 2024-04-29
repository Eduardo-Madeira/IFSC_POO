package ads.poo;

public class Telefone {
    private String rotulo;
    private String valor;
    
    public Telefone(String rotulo, String valor) {
        this.rotulo = rotulo;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Telefone: /n Rotulo = " + rotulo + ", valor = " + valor;
    }
}
