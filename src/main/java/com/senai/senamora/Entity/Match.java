package com.senai.senamora.Entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "Matches")
public class Match {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private long usuario1Id;
    private long usuario2Id;
    private LocalDateTime dataMatch;

    public Match() {
    }

    public Match(long usuario1Id, long usuario2Id, LocalDateTime dataMatch) {
        this.usuario1Id = usuario1Id;
        this.usuario2Id = usuario2Id;
        this.dataMatch = dataMatch;
    }

    public Match(long id, long usuario1Id, long usuario2Id, LocalDateTime dataMatch) {
        this.id = id;
        this.usuario1Id = usuario1Id;
        this.usuario2Id = usuario2Id;
        this.dataMatch = dataMatch;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUsuario1Id() {
        return usuario1Id;
    }

    public void setUsuario1Id(long usuario1Id) {
        this.usuario1Id = usuario1Id;
    }

    public long getUsuario2Id() {
        return usuario2Id;
    }

    public void setUsuario2Id(long usuario2Id) {
        this.usuario2Id = usuario2Id;
    }

    public LocalDateTime getDataMatch() {
        return dataMatch;
    }

    public void setDataMatch(LocalDateTime dataMatch) {
        this.dataMatch = dataMatch;
    }
}
