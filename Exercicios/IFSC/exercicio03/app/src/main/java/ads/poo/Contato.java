package ads.poo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Contato {
    private String nome;
    private String sobrenome;
    private LocalDate dataNasc;
    private ArrayList<Telefone> telefones;
    private ArrayList<Email> emails;
    
    public Contato(String nome, String sobrenome, LocalDate dataNasc) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNasc = dataNasc;
    }

    public boolean addTelefone(String numero, String rotulo){
        Telefone t = new Telefone(numero, rotulo);
        return this.telefones.add(t);
    }

    public boolean addEmail(String email, String rotulo){
        Email e = new Email(email, rotulo);
        return this.emails.add(e);
    }

    public boolean removeTelefone(String rotulo){
        return this.telefones.removeIf(elemento->elemento.equals(rotulo));
    }

    public boolean removeEmail(String rotulo){
        return this.emails.removeIf(elemento -> elemento.equals(rotulo));
    }

    public boolean updateTelefone(String rotulo, String valor){
       for (Telefone t: telefones){
           if (t.getRotulo().equals(rotulo)){
               t.setValor(valor);
               return true;
           }
       }
       return false;
    }

    public boolean updateEmail(String rotulo, String valor){
        for (Email e: emails){
            if (e.getRotulo().equals(rotulo)){
                e.setValor(valor);
                return true;
            }
        }
        return false;
     }

    @Override
    public String toString() {
        return "Contato nome=" + nome + ", sobrenome=" + sobrenome + ", dataNasc=" + dataNasc + ", telefones="
                + telefones + ", email=" + emails;
    }

    // TODO como excluir ??

    
}