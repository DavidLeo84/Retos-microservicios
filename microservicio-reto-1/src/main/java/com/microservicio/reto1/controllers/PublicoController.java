package com.microservicio.reto1.controllers;

import com.microservicio.reto1.dtos.MensajeDTO;
import com.microservicio.reto1.dtos.SaludoDTO;
import com.microservicio.reto1.services.UsuarioServicioImpl;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class PublicoController {

    private final UsuarioServicioImpl usuarioServicio;

    @GetMapping("/saludo")
    public ResponseEntity<?> saludo(@Valid @RequestBody SaludoDTO saludoDTO) throws RuntimeException {

        String saludo = usuarioServicio.saludoUsuario(saludoDTO);
        return ResponseEntity.ok().body(new MensajeDTO<>(false, saludo));
    }
}
