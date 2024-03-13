package ads.poo;

public class Caneta {
    
    private String cor = "Preto";
    private int tinta = 100;

    

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getTinta() {
        return tinta;
    }

    public void setTinta(int tinta) {
        this.tinta = tinta;
    }

    public String desenhar(){
        // TODO caneta não desenha sem tinta
        tinta--;
        return "desenhando na cor " + cor;
    }
}
