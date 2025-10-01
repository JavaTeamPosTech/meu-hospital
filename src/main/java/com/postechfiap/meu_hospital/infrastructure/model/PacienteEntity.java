package com.postechfiap.meu_hospital.infrastructure.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@NoArgsConstructor
@Getter
@Entity
@Table(name = "pacientes")
@PrimaryKeyJoinColumn(name = "id")
public class PacienteEntity extends UsuarioEntity {

    @Column(name = "convenio", length = 100)
    private String convenio;

    @Column(name = "numero_cartao_saude", length = 30)
    private String numeroCartaoSaude;

    public PacienteEntity(String nome, String email, String login, String senha, LocalDate dataNascimento, String cpf,
                          String telefone, EnderecoEntity endereco, String convenio, String numeroCartaoSaude) {
        super(nome, email, login, senha, dataNascimento, cpf, telefone, endereco);
        this.convenio = convenio;
        this.numeroCartaoSaude = numeroCartaoSaude;
    }

}
