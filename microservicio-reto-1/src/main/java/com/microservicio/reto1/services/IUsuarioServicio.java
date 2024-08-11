package com.microservicio.reto1.services;

import com.microservicio.reto1.dtos.SaludoDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.MethodArgumentNotValidException;

@Service
public interface IUsuarioServicio {

    String saludoUsuario(SaludoDTO saludo);
}
