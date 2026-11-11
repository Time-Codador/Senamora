package com.senai.senamora.Repository;

import com.senai.senamora.Entity.Curtida;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurtidaRepository extends JpaRepository<Curtida, Long> {

    boolean existsByUsuarioOrigemAndUsuarioDestinoAndCurtiuTrue(long origem, long destino);
    boolean existsByUsuarioOrigemAndUsuarioDestino(long origemId, long destinoId);
}
