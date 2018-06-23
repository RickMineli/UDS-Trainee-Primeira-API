package br.com.uds.trainee.personagem;

import io.swagger.annotations.ApiModelProperty;

import java.time.LocalDateTime;
import java.util.UUID;

public class Personagem {
    @ApiModelProperty(hidden = true)
    private final UUID id;
    private String nome;
    @ApiModelProperty(hidden = true)
    private final LocalDateTime dataCriacao;
    private int nivelDePoder;
    private int pontosDeVide;

    public Personagem (){
        this.id = UUID.randomUUID();
        this.dataCriacao = LocalDateTime.now();
    }

    public Personagem(String nome, int nivelDePoder, int pontosDeVide) {
        this();
        this.nome = nome;
        this.nivelDePoder = nivelDePoder;
        this.pontosDeVide = pontosDeVide;
    }

    public void setNivelDePoder(int nivelDePoder) {
        this.nivelDePoder = nivelDePoder;
    }

    public void setPontosDeVide(int pontosDeVide) {
        this.pontosDeVide = pontosDeVide;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public UUID getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public int getNivelDePoder() {
        return nivelDePoder;
    }

    public int getPontosDeVide() {
        return pontosDeVide;
    }

    @Override
    public String toString() {
        return "Personagem{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", dataCriacao=" + dataCriacao +
                ", nivelDePoder=" + nivelDePoder +
                ", pontosDeVide=" + pontosDeVide +
                '}';
    }
}
