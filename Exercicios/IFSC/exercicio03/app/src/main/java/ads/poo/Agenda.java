package ads.poo;

public class Agenda {
    private Contato contato;

    public Agenda(Contato contato) {
        this.contato = contato;
    }

    @Override
    public String toString() {
        return "Agenda: /n Contato = " + contato;
    }

    // TODO como excluir de arraylist
    
    // Validar sobre a necessidade de add e edit numero e e-mail sem saber um contato.

    
}