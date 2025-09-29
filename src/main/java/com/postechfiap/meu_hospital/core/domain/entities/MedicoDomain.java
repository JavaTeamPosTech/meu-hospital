package com.postechfiap.meu_hospital.core.domain.entities;

import lombok.Getter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@Getter
public class MedicoDomain extends UsuarioDomain {

    private String crm;
    private BigDecimal salario;
    private EnderecoDomain endereco;

    public MedicoDomain(String nome, String telefone, String email, LocalDate dataNascimento, String cpf, String login,
                        String senha, String crm, BigDecimal salario, EnderecoDomain endereco) {
        super(nome, telefone, email, dataNascimento, cpf, login, senha);

        if (crm == null || crm.length() < 6) {
            throw new IllegalArgumentException("CRM é obrigatório e deve conter mais de 6 caracteres.");
        }

        if (salario == null || salario.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Salário é obrigatório e deve ser maior que zero.");
        }

        if (endereco == null) {
            throw new IllegalArgumentException("Endereço é obrigatório");
        }

        this.crm = crm;
        this.salario = salario;
        this.endereco = endereco;
    }

    public MedicoDomain(UUID id, String nome, String telefone,  String email, LocalDate dataNascimento, String cpf,
                        String login, String senha, String crm, BigDecimal salario, EnderecoDomain endereco ){
        super(id, nome, telefone, email, dataNascimento, cpf, login, senha);

        this.crm = crm;
        this.salario = salario;
        this.endereco = endereco;
    }

}
