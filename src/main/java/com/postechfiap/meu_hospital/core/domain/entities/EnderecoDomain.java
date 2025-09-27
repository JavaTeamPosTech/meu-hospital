package com.postechfiap.meu_hospital.core.domain.entities;

import lombok.Getter;

import java.util.UUID;

@Getter
public class EnderecoDomain {

    private UUID id;
    private String estado;
    private String cidade;
    private String bairro;
    private String rua;
    private Integer numero;
    private String complemento;
    private String cep;
    private UsuarioDomain usuario;


    public EnderecoDomain(String estado, String cidade, String bairro, String rua, Integer numero, String complemento,
                          String cep, UsuarioDomain usuario) {
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
        this.usuario = usuario;
    }
}
