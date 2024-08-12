package com.microservicio.reto1.dtos;

import jakarta.validation.constraints.NotBlank;

public record LoginDTO(

        @NotBlank(message = "El nombre es obligatorio")
        String nombre,

        @NotBlank(message = "La clave es obligatoria")
        String clave
) {
}
