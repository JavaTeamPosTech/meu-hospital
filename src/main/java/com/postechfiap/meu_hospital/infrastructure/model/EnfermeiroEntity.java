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
@Table(name = "enfermeiros")
@PrimaryKeyJoinColumn(name = "id")
public class EnfermeiroEntity extends UsuarioEntity {

    @Column(unique = true, nullable = false)
    private String coren;

    @Column(precision = 10, scale = 2, nullable = false)
    private BigDecimal salario;

    public EnfermeiroEntity(String nome, String email, String login, String senha, LocalDate dataNascimento, String cpf,
                            String coren, BigDecimal salario, EnderecoEntity endereco) {
        super(nome, email, login, senha, dataNascimento, cpf, endereco);
        this.coren = coren;
        this.salario = salario;
    }

}
