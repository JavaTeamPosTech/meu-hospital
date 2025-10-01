package com.postechfiap.meu_hospital.infrastructure.api.dtos.request;

import com.postechfiap.meu_hospital.core.dtos.CadastrarMedicoInputModel;
import com.postechfiap.meu_hospital.core.dtos.CadastrarPacienteInputModel;
import com.postechfiap.meu_hospital.core.dtos.EnderecoInputModel;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.validation.constraints.*;

import java.math.BigDecimal;
import java.time.LocalDate;

public record CadastrarPacienteRequestDTO(

        @Schema(description = "Nome completo do médico. Precisa estar preenchido.", example = "José Ricardo")
        @NotBlank(message = "Nome é obrigatório")
        @Size(min = 2, max = 100, message = "Nome deve ter entre 2 e 100 caracteres")
        String nome,

        @Schema(description = "Endereço de e-mail do médico. Precisa estar preenchido e ser válido.", example = "jose.ricardo@meuhospital.com")
        @NotBlank(message = "Email é obrigatório")
        @Email(message = "Email inválido")
        @Size(max = 100, message = "Email deve ter no máximo 100 caracteres")
        String email,

        @Schema(description = "Data de nascimento do médico (formato AAAA-MM-DD). Precisa estar preenchida.", example = "1990-01-01")
        @NotNull(message = "Data de nascimento é obrigatória")
        @PastOrPresent(message = "Data de nascimento não pode ser futura")
        LocalDate dataNascimento,

        @Schema(description = "CPF do médico (apenas números). Precisa estar preenchido.", example = "12345678900")
        @NotBlank(message = "CPF é obrigatório")
        @Pattern(regexp = "^\\d{11}$", message = "CPF deve conter 11 dígitos numéricos")
        String cpf,

        @Schema(description = "Login para acesso. Precisa estar preenchido.", example = "jose.ricardo")
        @NotBlank(message = "Login é obrigatório")
        @Size(min = 4, max = 50, message = "O login deve ter entre 4 e 50 caracteres")
        String login,

        @Schema(description = "Senha do médico. Precisa estar preenchida e ser forte.", example = "senhaForte123!")
        @NotBlank(message = "Senha é obrigatória")
        @Size(min = 6, max = 100, message = "A senha deve ter entre 6 e 100 caracteres")
        String senha,


        String convenio,

        String numeroCartaoSaude,

        @Schema(description = "Telefone do médico (apenas números, com ou sem DDI). Precisa estar preenchido.", example = "5581999992345")
        @Pattern(regexp = "^\\+?\\d{8,15}$", message = "Número de telefone inválido")
        @NotBlank(message = "Telefone é obrigatório")
        String telefone,


        EnderecoRequestDTO endereco
) {

    public CadastrarPacienteInputModel toInputModel(){

        EnderecoInputModel enderecoInputModel = endereco.toInputModel();

        return new CadastrarPacienteInputModel(
                nome, email, login, senha, dataNascimento, cpf, telefone, convenio, numeroCartaoSaude, enderecoInputModel
        );
    }
}
