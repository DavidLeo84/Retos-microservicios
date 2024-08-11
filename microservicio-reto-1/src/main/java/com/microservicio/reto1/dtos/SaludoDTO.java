package com.microservicio.reto1.dtos;

import jakarta.validation.constraints.NotBlank;

public record SaludoDTO(

        @NotBlank(message = "Solicitud no válida: El nombre es obligatorio")
        String nombre
) {
}
