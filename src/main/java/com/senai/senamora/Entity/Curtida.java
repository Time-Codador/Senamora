package com.senai.senamora.Entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "Curtidas")
public class Curtida {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private long usuarioOrigem;
    private long usuarioDestino;
    private boolean curtiu;
    private LocalDateTime dataInteracao;

    public Curtida() {
    }

    public Curtida(long usuarioOrigem, long usuarioDestino, boolean curtiu, LocalDateTime dataInteracao) {
        this.usuarioOrigem = usuarioOrigem;
        this.usuarioDestino = usuarioDestino;
        this.curtiu = curtiu;
        this.dataInteracao = dataInteracao;
    }

    public Curtida(long id, long usuarioOrigem, long usuarioDestino, boolean curtiu, LocalDateTime dataInteracao) {
        this.id = id;
        this.usuarioOrigem = usuarioOrigem;
        this.usuarioDestino = usuarioDestino;
        this.curtiu = curtiu;
        this.dataInteracao = dataInteracao;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUsuarioOrigem() {
        return usuarioOrigem;
    }

    public void setUsuarioOrigem(long usuarioOrigem) {
        this.usuarioOrigem = usuarioOrigem;
    }

    public long getUsuarioDestino() {
        return usuarioDestino;
    }

    public void setUsuarioDestino(long usuarioDestino) {
        this.usuarioDestino = usuarioDestino;
    }

    public boolean isCurtiu() {
        return curtiu;
    }

    public void setCurtiu(boolean curtiu) {
        this.curtiu = curtiu;
    }

    public LocalDateTime getDataInteracao() {
        return dataInteracao;
    }

    public void setDataInteracao(LocalDateTime dataInteracao) {
        this.dataInteracao = dataInteracao;
    }
}
