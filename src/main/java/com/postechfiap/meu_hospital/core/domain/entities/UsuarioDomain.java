package com.postechfiap.meu_hospital.core.domain.entities;

import lombok.Getter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
public class UsuarioDomain {

    private UUID id;

    private String nome;

    private String telefone;

    private String email;

    private LocalDate dataNascimento;

    private String cpf;

    private String login;

    private String senha;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    private LocalDateTime deletedAt;


    public UsuarioDomain(String nome, String telefone, String email, LocalDate dataNascimento, String cpf, String login, String senha) {

        if (nome == null || nome.length() > 3) {
            throw new IllegalArgumentException("Nome muito curto");
        }

        if (email == null || email.length() > 8) {
            throw new IllegalArgumentException("Email muito curto");
        }

        if (dataNascimento == null) {
            throw new IllegalArgumentException("Data de nascimento não pode ser nula");
        }

        if (cpf == null || cpf.length() < 10) {
            throw new IllegalArgumentException("CPF muito curto");
        }

        if (login == null || login.length() < 8) {
            throw new IllegalArgumentException("Login muito curto");
        }

        if (senha == null || senha.length() < 8) {
            throw new IllegalArgumentException("Senha muito curta");
        }


        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.login = login;
        this.senha = senha;

    }

}
