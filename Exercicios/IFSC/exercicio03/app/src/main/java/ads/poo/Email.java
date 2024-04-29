package ads.poo;

public class Email {
    private String rotulo;
    private String valor;
    
    public Email(String rotulo, String valor) {
        this.rotulo = rotulo;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Email: /n Rotulo = " + rotulo + ", Valor = " + valor;
    }
}
