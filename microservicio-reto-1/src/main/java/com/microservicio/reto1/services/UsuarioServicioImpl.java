package com.microservicio.reto1.services;

import com.microservicio.reto1.dtos.SaludoDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.MethodArgumentNotValidException;

@Service
public class UsuarioServicioImpl implements IUsuarioServicio{

    @Override
    public String saludoUsuario(SaludoDTO saludo){

        return "Hola " + saludo.nombre();
    }
}
