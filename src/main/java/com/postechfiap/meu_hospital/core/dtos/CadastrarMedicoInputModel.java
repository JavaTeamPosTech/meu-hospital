package com.postechfiap.meu_hospital.core.dtos;

import lombok.Getter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
public class CadastrarMedicoInputModel {

    private String nome;

    private  String email;

    private String login;

    private String senha;

    private LocalDate dataNascimento;

    private String cpf;

    private String crm;

    private BigDecimal salario;

    public CadastrarMedicoInputModel(String nome, String email, String login, String senha, LocalDate dataNascimento, String cpf, BigDecimal salario) {
        this.nome = nome;
        this.email = email;
        this.login = login;
        this.senha = senha;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.salario = salario;
    }

}
