package com.postechfiap.meu_hospital.core.domain.entities;

import lombok.Getter;

import java.time.LocalDate;

@Getter
public class MedicoDomain extends UsuarioDomain {

    public MedicoDomain(String nome, String telefone, String email, LocalDate dataNascimento, String cpf, String login, String senha){
        super(nome, telefone, email, dataNascimento, cpf, login, senha);
    }
}
