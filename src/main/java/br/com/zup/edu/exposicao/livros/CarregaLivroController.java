package br.com.zup.edu.exposicao.livros;

import br.com.zup.edu.exposicao.client.DetalhesDoAutorResponse;
import br.com.zup.edu.exposicao.client.DetalhesDoLivroResponse;
import br.com.zup.edu.exposicao.client.LivrariaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import static org.springframework.http.HttpStatus.NOT_FOUND;

@RestController
public class CarregaLivroController {

    @Autowired
    private LivrariaClient client;

    @GetMapping("/api/livros/{id}")
    public ResponseEntity<?> carrega(@PathVariable Long id) {

        DetalhesDoLivroResponse livro = client.detalhaLivroPorId(id).orElseThrow(() -> {
            throw new ResponseStatusException(NOT_FOUND, "livro com ID %d não encontrado".formatted(id));
        });

        DetalhesDoAutorResponse autor = client.detalhaAutorPorId(livro.getAutorId()).orElseThrow(() -> {
            throw new ResponseStatusException(NOT_FOUND,
                    "autor com ID %d do livro não encontrado".formatted(livro.getAutorId()));
        });

        LivroComAutorResponse livroComAutorResponse = new LivroComAutorResponse(livro, autor);
        return ResponseEntity
                        .ok(livroComAutorResponse);
    }
}
