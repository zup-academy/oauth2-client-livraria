package br.com.zup.edu.exposicao.livros;

import br.com.zup.edu.exposicao.client.DetalhesDoAutorResponse;
import br.com.zup.edu.exposicao.client.DetalhesDoLivroResponse;

import java.time.LocalDate;

public class LivroComAutorResponse {

    private final Long id;
    private final String nome;
    private final String descricao;
    private final String isbn;
    private final LocalDate publicadoEm;
    private final AutorResponse autor;

    public LivroComAutorResponse(DetalhesDoLivroResponse livro, DetalhesDoAutorResponse autor) {
        this.id = livro.getId();
        this.nome = livro.getNome();
        this.descricao = livro.getDescricao();
        this.isbn = livro.getIsbn();
        this.publicadoEm = livro.getPublicadoEm();
        this.autor =  new AutorResponse(autor);
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getIsbn() {
        return isbn;
    }

    public LocalDate getPublicadoEm() {
        return publicadoEm;
    }

    public AutorResponse getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return "LivroComAutorResponse{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", isbn='" + isbn + '\'' +
                ", publicadoEm=" + publicadoEm +
                ", autor=" + autor +
                '}';
    }
}
