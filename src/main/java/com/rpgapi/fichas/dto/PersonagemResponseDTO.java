package com.rpgapi.fichas.dto;

import com.rpgapi.fichas.model.Personagem;

import java.util.List;

public record PersonagemResponseDTO (
        Long id,
        String nome,
        String classe,
        Integer nivel,
        List<AtributoDTO> atributos
){
    public PersonagemResponseDTO(Personagem personagem, List<AtributoDTO>atributosOriginais) {
        this(
            personagem.getId(),
            personagem.getNome(),
            personagem.getClasse(),
            personagem.getNivel(),
            atributosOriginais.stream()
                        .map(attr -> new AtributoDTO(attr.nome(), attr.valor()))
                        .toList()
        );
    }

}
