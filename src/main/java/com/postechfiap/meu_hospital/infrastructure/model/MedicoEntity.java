package com.postechfiap.meu_hospital.infrastructure.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "medicos")
@PrimaryKeyJoinColumn(name = "id")
public class MedicoEntity extends UsuarioEntity {

    @Column(unique = true, nullable = false)
    private String crm;

    @Column(precision = 10, scale = 2, nullable = false, name = "salario_por_hora")
    private BigDecimal salario;

    public MedicoEntity(String nome, String email, String login, String senha, LocalDate dataNascimento, String cpf,
                        String crm, BigDecimal salario, EnderecoEntity endereco) {
        super(nome,  email, login, senha, dataNascimento, cpf, endereco);
        this.crm = crm;
        this.salario = salario;
    }
}
