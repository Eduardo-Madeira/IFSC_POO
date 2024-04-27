import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;

public class Contato {
    
    private String nome;
    private String sobrenome;
    private LocalDate dataNasc;
    private ArrayList<Telefone> telefones;
    private ArrayList<Email> emails;
    
    public Contato(String nome, String sobrenome, LocalDate dataNasc, ArrayList<Telefone> telefones,
            ArrayList<Email> emails) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNasc = dataNasc;
        this.telefones = telefones;
        this.emails = emails;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSobrenome() {
        return sobrenome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public LocalDate getDataNasc() {
        return dataNasc;
    }
    public void setDataNasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
    }
    public ArrayList<Telefone> getTelefones() {
        return telefones;
    }
    public void setTelefones(ArrayList<Telefone> telefones) {
        this.telefones = telefones;
    }
    public ArrayList<Email> getEmails() {
        return emails;
    }
    public void setEmails(ArrayList<Email> emails) {
        this.emails = emails;
    }

    @Override
    public String toString() {
        return "Contato [nome=" + nome + ", sobrenome=" + sobrenome + ", dataNasc=" + dataNasc + ", telefones="
                + telefones + ", emails=" + emails + "]";
    }

    
}
