package ads.poo;

public class Email {
    private String rotulo;
    private String valor;
    
    public Email(String valor, String rotulo) {
        String eR = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
        if (valor.matches(eR)) {
            this.valor = valor;
        }else{
            this.valor = "";
        }

        this.rotulo = rotulo;
    }
    
    @Override
    public String toString() {
        return "Email: /n Rotulo = " + rotulo + ", Valor = " + valor;
    }

    public String getRotulo() {
        return rotulo;
    }

    public void setRotulo(String rotulo) {
        this.rotulo = rotulo;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    
}
