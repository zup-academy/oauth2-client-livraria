package br.com.zup.edu.exposicao.livros;

import br.com.zup.edu.exposicao.client.DetalhesDoAutorResponse;

public class AutorResponse {

    private String nome;
    private String email;

    public AutorResponse(DetalhesDoAutorResponse autor) {
        this.nome = autor.getNome();
        this.email = autor.getEmail();
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }
}
