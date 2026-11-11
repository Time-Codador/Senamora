package com.senai.senamora.Controller;

import com.senai.senamora.Entity.Match;
import com.senai.senamora.Service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/matches")
public class MatchController {

    @Autowired
    private MatchService matchService;

    @PostMapping("/interagir")
    public String interagir(@RequestParam long origemId,
                            @RequestParam long destinoId,
                            @RequestParam boolean curtiu) {
        return matchService.interagir(origemId, destinoId, curtiu);
    }

    @GetMapping("/mostrar/{usuarioId}")
    public List<Match> listarMatches(@PathVariable long usuarioId) {
        return matchService.listarMatchesDoUsuario(usuarioId);
    }
}
