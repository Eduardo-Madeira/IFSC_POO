package ads.poo;

public class Carro {
    private int veloAtual;

    @Override
    public String toString() {
        return "A velocidade atual é " + veloAtual;
    }

    public Carro(int veloAtual) {
        this.veloAtual = veloAtual;
    }

    public Carro(){
        this(0);
    }

    public int getVeloAtual() {
        return veloAtual;
    }

    public void setVeloAtual(int veloAtual) {
        if (0 > veloAtual || veloAtual > 200){
            veloAtual = 0;
        }else{
            this.veloAtual = veloAtual;
        }
    }

    public String acelarar(int acelerar){
        if (acelerar < 0){
            return "Não é possivel acelerar negativamente. Manteve sua velocidade " + veloAtual;
        } else{
            if(veloAtual + acelerar >= 200){
                veloAtual = 200;
            } else{
                veloAtual+=acelerar;
            }
            return "Sua velocidade atual é " + veloAtual;
        }
    }

    public String frear(int reduzir){
        if (reduzir < 0){
            return "Não é possivel reduzir positivamente. Manteve sua velocidade " + veloAtual;
        } else{
            if(veloAtual - reduzir <= 0){
                veloAtual = 0;
            } else{
                veloAtual-=reduzir;
            }
        }
        return "Sua velocidade foi reduzida a " + veloAtual;
    }
    
}
