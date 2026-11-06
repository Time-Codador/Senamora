package com.senai.senamora.Service;

import com.senai.senamora.Entity.Usuario;
import com.senai.senamora.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> buscarUsuario(){
        return usuarioRepository.findAll();
    }

    public void salvarUsuario(Usuario uzuario){
        Usuario usuario = new Usuario (uzuario.getNome(),uzuario.getIdade(), uzuario.getProfissao(), uzuario.getGenero());
        usuarioRepository.save(usuario);
    }


    public Optional<Usuario> atualizar(Long id, Usuario dadosAtualizados) {
        Optional<Usuario> usuarioOp = usuarioRepository.findById(id);

        if (usuarioOp.isPresent()) {
            Usuario usuarioExistente = usuarioOp.get();
            usuarioExistente.setNome(dadosAtualizados.getNome());
            usuarioExistente.setIdade(dadosAtualizados.getIdade());
            usuarioExistente.setGenero(dadosAtualizados.getGenero());
            usuarioExistente.setProfissao(dadosAtualizados.getProfissao());

            return Optional.of(usuarioRepository.save(usuarioExistente));
        }

        return Optional.empty();
    }

    public boolean deletar(Long id) {
        if (usuarioRepository.existsById(id)) {
            usuarioRepository.deleteById(id);
            return true;
        }
        return false;
    }


}
