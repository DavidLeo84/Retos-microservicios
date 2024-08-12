package com.microservicio.reto1.services;

import com.microservicio.reto1.dtos.LoginDTO;
import com.microservicio.reto1.dtos.SaludoDTO;
import com.microservicio.reto1.dtos.TokenDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.MethodArgumentNotValidException;

@Service
public interface IUsuarioServicio {

    String saludoUsuario(SaludoDTO saludo);

    TokenDTO login(LoginDTO loginDTO);
}
