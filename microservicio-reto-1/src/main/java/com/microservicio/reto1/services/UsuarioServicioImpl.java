package com.microservicio.reto1.services;

import com.microservicio.reto1.dtos.LoginDTO;
import com.microservicio.reto1.dtos.SaludoDTO;
import com.microservicio.reto1.dtos.TokenDTO;
import com.microservicio.reto1.entities.Usuario;
import com.microservicio.reto1.utils.JWTUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.MethodArgumentNotValidException;

import java.util.HashMap;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class UsuarioServicioImpl implements IUsuarioServicio{

    private final JWTUtils jwtUtils;

    @Override
    public String saludoUsuario(SaludoDTO saludo){
        return "Hola " + saludo.nombre();
    }

    @Override
    public TokenDTO login(LoginDTO loginDTO) {

        Usuario usuario = Usuario.builder().build();
        Map<String, Object> map = new HashMap<>();
        /*try {
            usuario = validacionCliente.buscarPorEmail(loginDTO.email());
        } catch (Exception e) {
            System.out.println("MensajeError = " + e.getMessage());
        }*/

        /*BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        if (!passwordEncoder.matches(loginDTO.password(), cliente.getPassword())) {
            throw new NoSuchElementException("La contraseña es incorrecta");
        }*/

        map.put("emisor", "ingesis.uniquindio.edu.co");
        map.put("usuario", loginDTO.nombre());
        map.put("clave", loginDTO.clave());
        return new TokenDTO(jwtUtils.generarToken(loginDTO.nombre(), map));
    }
}
