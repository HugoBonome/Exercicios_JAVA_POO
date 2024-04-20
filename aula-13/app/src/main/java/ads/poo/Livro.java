package ads.poo;

import java.util.ArrayList;

public class Livro {
    private String titulo;
    private Double preco;
    private String isbn;
    private ArrayList<Autor> autores = new ArrayList<>();



    public Livro(String titulo, String isbn, Double preco, ArrayList<Autor> autores) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.preco = preco;
        this.autores = autores;
    }

    @Override
    public String toString() {

        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", preco=" + preco +
                ", isbn='" + isbn + '\'' +
                ", autores=" + autores.toString() +
                '}';
    }

    public String getIsbn() {
        return isbn;
    }
}

