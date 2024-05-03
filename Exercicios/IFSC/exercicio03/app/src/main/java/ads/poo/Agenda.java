package ads.poo;

import java.time.LocalDate;

public class Agenda {
    private Contato contato;

    public Agenda(Contato contato) {
        this.contato = contato;
    }

    @Override
    public String toString() {
        return "Agenda: /n Contatos = " + contato;
    }

    public boolean addContato(String nome, String sobrenome, LocalDate dataNasc){
        contato = new Contato(nome, sobrenome, dataNasc);
        return true;
    }

    // TODO como excluir de arraylist
    
    // Validar sobre a necessidade de add e edit numero e e-mail sem saber um contato.

    
}