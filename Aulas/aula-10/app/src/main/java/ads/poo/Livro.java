package ads.poo;

import java.util.ArrayList;

public class Livro {

    private String titulo;
    private Double preco;
    private ArrayList<Autor> autores;
    private String isbn;
    
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public Double getPreco() {
        return preco;
    }
    public void setPreco(Double preco) {
        this.preco = preco;
    }
    public ArrayList<Autor> getAutores() {
        return autores;
    }
    public void setAutores(ArrayList<Autor> autores) {
        this.autores = autores;
    }
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    
    public Livro(String titulo, Double preco, ArrayList<Autor> autores, String isbn) {
        this.titulo = titulo;
        this.preco = preco;
        this.autores = autores;
        this.isbn = isbn;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Autor autor : this.autores){
            sb.append(autor);
        }

        return String.format("ISBN= %s, Titulo= %s, Preco= d, Autores= /n%ss", isbn, titulo, preco, autores, sb);
    }

    public boolean addAutor(Autor a){
        return this.autores.add(a);
    }

}
