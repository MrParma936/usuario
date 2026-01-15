package com.marcio.usuario.business.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UsuarioDTO {

    private String nome;
    private String email;
    private String senha;
    private List<enderecoDTO> enderecos;
    private List<telefoneDTO> telefones;

}
