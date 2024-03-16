package ads.poo;

public class Caneta {
    
    private String cor;
    private int tinta;
    
    @Override
    public String toString() {
        return "Caneta [cor=" + cor + ", tinta=" + tinta + "]";
    }
    
    public Caneta(String cor, int tinta) {
        this.cor = cor;
        this.tinta = tinta;
    }
    
    public Caneta(String cor) {
        // this.cor = cor;
        // tinta = 100;
        this(cor, 100);
    }
    
    public Caneta() {
        // this.cor = "Vermelha";
        // this.tinta = 100; Não faremos isso, chamaremos o construtor acima.
        this("vermelha", 100);
    }
    

    // public String getCor() {
    //     return cor;
    // }

    // public void setCor(String cor) {
    //     this.cor = cor;
    // }

    // public int getTinta() {
    //     return tinta;
    // }

    // public void setTinta(int tinta) {
    //     this.tinta = tinta;
    // }

    

    public String desenhar(){
        // TODO caneta não desenha sem tinta
        tinta--;
        return "desenhando na cor " + cor;
    }

}