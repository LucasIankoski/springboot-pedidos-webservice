package com.webservices.spring.pedidos.repositories;

import com.webservices.spring.pedidos.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
