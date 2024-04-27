public class Telefone {
    
    private String rotulo;
    private String valor;
    
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
    public Telefone(String rotulo, String valor) {
        this.rotulo = rotulo;
        this.valor = valor;
    }
    @Override
    public String toString() {
        return "Telefone rotulo= " + rotulo + ", valor= " + valor;
    }

    
}
