import java.lang.reflect.Array;
import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contato> contatos;

    public Agenda(ArrayList<Contato> contatos) {
        this.contatos = contatos;
    }

    public ArrayList<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(ArrayList<Contato> contatos) {
        this.contatos = contatos;
    }

    @Override
    public String toString() {
        return "Agenda contatos=" + contatos;
    }

}
