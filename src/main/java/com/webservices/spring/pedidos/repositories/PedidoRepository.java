package com.webservices.spring.pedidos.repositories;

import com.webservices.spring.pedidos.entities.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
