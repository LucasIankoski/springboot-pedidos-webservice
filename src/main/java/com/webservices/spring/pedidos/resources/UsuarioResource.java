package com.webservices.spring.pedidos.resources;

import com.webservices.spring.pedidos.entities.Usuario;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioResource {

    @GetMapping
    public ResponseEntity<Usuario> findAll(){
        Usuario u = new Usuario(1L, "Lucas", "lucas@gmail.com", "51 996064406", "12345");
        return ResponseEntity.ok().body(u);
    }
}
