package com.microservicio.reto1.entities;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Usuario {

    private String nombre;
    private String clave;
}
