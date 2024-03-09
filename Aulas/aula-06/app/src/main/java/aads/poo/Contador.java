package aads.poo;

public class Contador {
    
    private int valorAtual;

    public void addValor(int v){
        valorAtual=+v;
    }

    public void cont(){
        valorAtual++;
    }

    public int valorCont(){
        return valorAtual;
    }
}
