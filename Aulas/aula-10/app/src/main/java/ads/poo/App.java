package ads.poo;

import java.util.ArrayList;
import java.util.HashMap;

public class App {
    
    public static void main(String[] args) {
        
        HashMap<String, Livro> bancoDeDados = new HashMap<>();

        ArrayList<Autor> autores = new ArrayList<>();

        autores.add(new Autor("Eduardo", "Brasileiro"));
        autores.add(new Autor("Machado de Assis", "Brasileiro"));

        Livro memoriaPostuma = new Livro("Memórias Póstumas de Brás Cubas", 40.00, autores, "100");
        if (!bancoDeDados.containsKey(memoriaPostuma.getIsbn())){
            bancoDeDados.put(memoriaPostuma.getIsbn(), memoriaPostuma);
        } else{
            System.out.println("Já existe um livro cadastrado");
        }

        Livro mobyDick = new Livro("Moby Dick", 20.00, autores, "101");
        if (!bancoDeDados.containsKey(mobyDick.getIsbn())){
            bancoDeDados.put(mobyDick.getIsbn(), mobyDick);
        } else{
            System.out.println("Já existe um livro cadastrado");
        }

        Livro l = bancoDeDados.get("100");
        if (l != null){
            Autor outro = new Autor("Outro", "ARG");
            l.addAutor(outro);
        }

        bancoDeDados.forEach((chave, valor)->{
            System.out.println("Titulo: " + valor.getTitulo() + ", Preço: " + valor.getPreco() + " Autores: " + valor.getAutores() + ", Isbn: " + valor.getIsbn());
        });
        // System.out.println(bancoDeDados);
    }

}
