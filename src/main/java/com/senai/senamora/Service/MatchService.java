package com.senai.senamora.Service;

import com.senai.senamora.Entity.Curtida;
import com.senai.senamora.Entity.Match;
import com.senai.senamora.Repository.CurtidaRepository;
import com.senai.senamora.Repository.MatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class MatchService {

    @Autowired
    private CurtidaRepository curtidaRepository;

    @Autowired
    private MatchRepository matchRepository;

    public String interagir(long origemId, long destinoId, boolean curtiu) {
        // 1. Impede que o usuário curta a si mesmo
        if (origemId == destinoId) {
            return "Você não pode interagir com o seu próprio perfil.";
        }

        if (curtidaRepository.existsByUsuarioOrigemAndUsuarioDestino(origemId, destinoId)) {
            return "Você já avaliou este perfil anteriormente.";
        }

        Curtida novaCurtida = new Curtida();
        novaCurtida.setUsuarioOrigem(origemId);
        novaCurtida.setUsuarioDestino(destinoId);
        novaCurtida.setCurtiu(curtiu);
        novaCurtida.setDataInteracao(LocalDateTime.now());
        curtidaRepository.save(novaCurtida);

        if (curtiu) {
            boolean deuMatch = curtidaRepository.existsByUsuarioOrigemAndUsuarioDestinoAndCurtiuTrue(destinoId, origemId);

            if (deuMatch) {
                Match novoMatch = new Match();
                novoMatch.setUsuario1Id(origemId);
                novoMatch.setUsuario2Id(destinoId);
                novoMatch.setDataMatch(LocalDateTime.now());
                matchRepository.save(novoMatch);

                return "Deu Match!";
            }
        }

        return "Interação registrada com sucesso.";
    }

    public List<Match> listarMatchesDoUsuario(long usuarioId) {
        return matchRepository.findByUsuario1IdOrUsuario2Id(usuarioId, usuarioId);
    }
}
