package br.com.uds.trainee.personagem;

import org.springframework.http.ResponseEntity;

import java.util.Set;
import java.util.UUID;

public interface PersonagemService {
    public Personagem criar(Personagem personagem);

    Set<Personagem> listar();

    Personagem obter(UUID id);

    void remover(UUID id);

    void editar(UUID id, Personagem personagem);
}
