package com.microservicio.reto1.controllers;

import com.microservicio.reto1.dtos.LoginDTO;
import com.microservicio.reto1.dtos.MensajeDTO;
import com.microservicio.reto1.dtos.SaludoDTO;
import com.microservicio.reto1.dtos.TokenDTO;
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

    @PostMapping("/login")
    public ResponseEntity<MensajeDTO<TokenDTO>> login(@Valid @RequestBody LoginDTO loginDTO) throws RuntimeException {

        TokenDTO tokenDTO = usuarioServicio.login(loginDTO);
        return ResponseEntity.ok().body(new MensajeDTO<>(false, tokenDTO));
    }
}
