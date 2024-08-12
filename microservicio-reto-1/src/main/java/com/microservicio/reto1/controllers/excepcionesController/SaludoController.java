package com.microservicio.reto1.controllers.excepcionesController;

import com.microservicio.reto1.dtos.MensajeDTO;
import com.microservicio.reto1.dtos.SaludoDTO;
import com.microservicio.reto1.services.UsuarioServicioImpl;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/controllers")
@RequiredArgsConstructor
@SecurityRequirement(name = "bearerAuth")
public class SaludoController {

    private final UsuarioServicioImpl usuarioServicio;

    @PostMapping("/saludo")
    public ResponseEntity<?> saludo(@Valid @RequestBody SaludoDTO saludoDTO) throws RuntimeException {

        String saludo = usuarioServicio.saludoUsuario(saludoDTO);
        return ResponseEntity.ok().body(new MensajeDTO<>(false, saludo));
    }
}
