package com.postechfiap.meu_hospital.infrastructure.api.dtos.response;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class ExcecaoDTO {

    private String mensagem;
    private Integer status;
    private LocalDateTime dataCriacao;

    public ExcecaoDTO(String mensagem, Integer status) {
        this.mensagem = mensagem;
        this.status = status;
        this.dataCriacao = LocalDateTime.now();
    }
}
