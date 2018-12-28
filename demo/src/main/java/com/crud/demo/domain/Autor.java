package com.crud.demo.domain;

import javax.persistence.*;

@Entity
@Table(name = "AUTOR")
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CODIGO")
    Integer codigo;
    @Column(name = "NOME")
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
}
