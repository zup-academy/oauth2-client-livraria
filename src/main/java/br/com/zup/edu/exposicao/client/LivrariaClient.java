package br.com.zup.edu.exposicao.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@FeignClient(
        name = "livrariaClient",
        url = "http://localhost:8080/oauth2-resourceserver-livraria/"
)
public interface LivrariaClient {

    @GetMapping("/api/livros/{id}")
    public Optional<DetalhesDoLivroResponse> detalhaLivroPorId(@PathVariable Long id);

    @GetMapping("/api/autores/{id}")
    public Optional<DetalhesDoAutorResponse> detalhaAutorPorId(@PathVariable Long id);

}
