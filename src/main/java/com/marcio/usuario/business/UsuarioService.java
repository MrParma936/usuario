package com.marcio.usuario.business;

import com.marcio.usuario.business.converter.UsuarioConverter;
import com.marcio.usuario.business.dto.UsuarioDTO;
import com.marcio.usuario.infrastructure.entity.Usuario;
import com.marcio.usuario.infrastructure.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;
    private final UsuarioConverter usuarioConverter;

    public UsuarioDTO salvaUsuario(UsuarioDTO usuarioDTO){
        Usuario usuario = usuarioConverter.paraUsuario((usuarioDTO));
        return usuarioConverter.paraUsuarioDTO(usuarioRepository.save(usuario));
    }
}
