package com.postechfiap.meu_hospital.core.dtos;

import lombok.Getter;

import java.time.LocalDate;

@Getter
public class CadastrarPacienteInputModel {

    private String nome;

    private  String email;

    private String login;

    private String senha;

    private LocalDate dataNascimento;

    private String cpf;

    private String telefone;

    private String convenio;

    private String numeroCartaoSaude;

    private EnderecoInputModel endereco;

    public CadastrarPacienteInputModel(String nome, String email, String login, String senha, LocalDate dataNascimento,
                                       String cpf, String telefone, String convenio, String numeroCartaoSaude, EnderecoInputModel endereco) {
        this.nome = nome;
        this.email = email;
        this.login = login;
        this.senha = senha;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.telefone = telefone;
        this.convenio = convenio;
        this.numeroCartaoSaude = numeroCartaoSaude;
        this.endereco = endereco;
    }


}
