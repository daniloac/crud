package com.crud.demo.dto;

import java.io.Serializable;

public class AutorDto implements Serializable {

    Integer codigo;
    String nome;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "AutorDto{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                '}';
    }
}

