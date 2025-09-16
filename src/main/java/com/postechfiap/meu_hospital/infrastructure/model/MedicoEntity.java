package com.postechfiap.meu_hospital.infrastructure.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "medicos")
@PrimaryKeyJoinColumn(name = "id")
public class MedicoEntity extends UsuarioEntity {

    @Column(unique = true)
    private String crm;

    @Column(precision = 10, scale = 2, nullable = false)
    private BigDecimal salario;

    public MedicoEntity(String nome, String email, String login, String senha, LocalDateTime dataNascimento, String cpf, String crm, BigDecimal salario) {
        super(nome,  email, login, senha, dataNascimento, cpf);
        this.crm = crm;
        this.salario = salario;
    }
}
