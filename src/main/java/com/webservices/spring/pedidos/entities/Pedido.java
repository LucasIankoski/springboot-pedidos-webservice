package com.webservices.spring.pedidos.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

@Entity
@Table(name = "tb_pedido")
public class Pedido implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Instant momentoPedido;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Usuario cliente;

    public Pedido() {
    }

    public Pedido(Long id, Instant momentoPedido, Usuario cliente) {
        this.id = id;
        this.momentoPedido = momentoPedido;
        this.cliente = cliente;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Instant getMomentoPedido() {
        return momentoPedido;
    }

    public void setMomentoPedido(Instant momentoPedido) {
        this.momentoPedido = momentoPedido;
    }

    public Usuario getCliente() {
        return cliente;
    }

    public void setCliente(Usuario cliente) {
        this.cliente = cliente;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pedido pedido = (Pedido) o;
        return Objects.equals(id, pedido.id) && Objects.equals(momentoPedido, pedido.momentoPedido) && Objects.equals(cliente, pedido.cliente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, momentoPedido, cliente);
    }


}
