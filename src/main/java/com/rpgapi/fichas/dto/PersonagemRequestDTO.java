package com.rpgapi.fichas.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

public record PersonagemRequestDTO(
        @NotBlank(message = "O nome não pode estar em branco")
        String nome,

        @NotBlank(message = "A classe é obrigatória")
        String classe,

        String subclasse,

        @Positive(message = "O nível deve ser maior que zero")
        Integer nivel
) {}