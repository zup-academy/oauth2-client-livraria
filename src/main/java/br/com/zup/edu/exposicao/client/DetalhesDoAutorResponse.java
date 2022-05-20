package br.com.zup.edu.exposicao.client;

import java.time.LocalDateTime;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class DetalhesDoAutorResponse {

    private final Long id;
    private final String nome;
    private final String email;
    private final String descricao;
    private final LocalDateTime criadoEm;

    public DetalhesDoAutorResponse(Long id, String nome, String email, String descricao, LocalDateTime criadoEm) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.descricao = descricao;
        this.criadoEm = criadoEm;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getDescricao() {
        return descricao;
    }

    public LocalDateTime getCriadoEm() {
        return criadoEm;
    }

}
