package ads.poo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Contato {
    private String nome;
    private String sobrenome;
    private LocalDate dataNasc;
    private ArrayList<Telefone> telefones;
    private ArrayList<Email> email;
    
    public Contato(String nome, String sobrenome, LocalDate dataNasc) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNasc = dataNasc;
    }

    public void setTelefones(ArrayList<Telefone> telefones) {
        this.telefones = telefones;
    }

    public void setEmail(ArrayList<Email> email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contato [nome=" + nome + ", sobrenome=" + sobrenome + ", dataNasc=" + dataNasc + ", telefones="
                + telefones + ", email=" + email + "]";
    }

    // TODO como excluir ??

    
}