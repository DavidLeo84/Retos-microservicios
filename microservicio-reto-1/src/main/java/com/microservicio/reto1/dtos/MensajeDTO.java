package com.microservicio.reto1.dtos;

public record MensajeDTO<T>(

        boolean error,
        T mensaje
) {
}