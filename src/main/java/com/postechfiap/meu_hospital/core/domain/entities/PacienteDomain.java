package com.postechfiap.meu_hospital.core.domain.entities;

import lombok.Getter;

import java.time.LocalDate;

@Getter
public class PacienteDomain extends UsuarioDomain{

    private String convenio;

    private String numeroCartaoSaude;


    public PacienteDomain(String nome, String telefone, String email, LocalDate dataNascimento, String cpf, String login,
                          String senha, String convenio, String numeroCartaoSaude, EnderecoDomain endereco) {
        super(nome, telefone, email, dataNascimento, cpf, login, senha);
        this.convenio = convenio;
        this.numeroCartaoSaude = numeroCartaoSaude;

    }


}
