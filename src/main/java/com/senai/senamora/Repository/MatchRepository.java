package com.senai.senamora.Repository;

import com.senai.senamora.Entity.Match;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MatchRepository extends JpaRepository<Match, Long> {
    List<Match> findByUsuario1IdOrUsuario2Id(long usuario1, long usuario2);
}
