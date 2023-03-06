package com.webservices.spring.pedidos.services;

import com.webservices.spring.pedidos.entities.Usuario;
import com.webservices.spring.pedidos.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    public List<Usuario> findAll(){
        return repository.findAll();
    }

    public Usuario findById(Long id){
        Optional<Usuario> objUsuario = repository.findById(id);
        return objUsuario.get();
    }

}
