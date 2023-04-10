package com.webservices.spring.pedidos.entities.enums;

import jdk.jshell.Snippet;

public enum StatusPedido {
    AGUARDANDO_ATENDIMENTO(0),
    ATENDIDO(1),
    EM_ATENDIMENTO(2),
    REABERTO(3),
    CANCELADO(4);

    private int codigo;

    private StatusPedido(int codigo){
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public static StatusPedido valueOf(int codigo){
        for (StatusPedido valor : StatusPedido.values()) {
            if(valor.getCodigo() == codigo){
                return valor;
            }
        }
        throw new IllegalArgumentException("Código inválido.");
    }
}
