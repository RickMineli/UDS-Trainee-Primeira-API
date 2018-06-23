package br.com.uds.trainee.personagem;

import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class PersonagemRepositoryImpl implements PersonagemRepository {

    private Set<Personagem> personagens = new HashSet();

    @Override
    public Personagem save(Personagem personagem) {
        personagens.add(personagem);
        return personagem;
    }

    @Override
    public Set<Personagem> findAll() {
        return personagens;
    }

    @Override
    public Personagem findOne(UUID id) {
        Personagem personagemRecuperado = null;
        for(Personagem personagem: personagens){
            if(personagem.getId().equals(id)){
                personagemRecuperado = personagem;
                break;
            }
        }
        return personagemRecuperado;
    }

    @Override
    public void delete(UUID id) {
        this.personagens.remove(this.findOne(id));


    }


}
