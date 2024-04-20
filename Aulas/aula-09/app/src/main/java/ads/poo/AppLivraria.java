package ads.poo;

import java.util.ArrayList;
import java.util.HashMap;

public class AppLivraria {
    
    public static void main(String[] args) {
        
        HashMap<String, Livro> bancoDeDados = new HashMap<>();

        ArrayList<Autor> autores = new ArrayList<>();

        autores.add(new Autor("Eduardo", "Brasileiro"));
        autores.add(new Autor("Machado de Assis", "Brasileiro"));

        Livro livro1 = new Livro("Memórias Póstumas de Brás Cubas", 40.00, autores, "1231231231231");
        if (!bancoDeDados.containsKey(livro1.getIsbn())){
            bancoDeDados.put(livro1.getIsbn(), livro1);
        } else{
            System.out.println("Já existe um livro cadastrado");
        }

        Livro livro2 = new Livro("Moby Dick", 20.00, autores, "1122334455667");
        if (!bancoDeDados.containsKey(livro2.getIsbn())){
            bancoDeDados.put(livro2.getIsbn(), livro2);
        } else{
            System.out.println("Já existe um livro cadastrado");
        }

        bancoDeDados.forEach((chave, valor)->{
            System.out.println("Titulo: " + valor.getTitulo() + ", Preço: " + valor.getPreco() + " Autores: " + valor.getAutores() + ", Isbn: " + valor.getIsbn());
        });
        // System.out.println(bancoDeDados);
    }

}
