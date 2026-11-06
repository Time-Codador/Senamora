package com.senai.senamora.Entity;

import jakarta.persistence.*;

@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nome;
    private int idade;
    private String profissao;
    @Enumerated(EnumType.STRING)
    private Genero genero;

    public Usuario() {
    }

    public Usuario(String nome, int idade, String profissao, Genero genero) {
        this.nome = nome;
        this.idade = idade;
        this.profissao = profissao;
        this.genero = genero;
    }

    public Usuario(long id, String nome, int idade, String profissao, Genero genero) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.profissao = profissao;
        this.genero = genero;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
}