package com.postechfiap.meu_hospital.infrastructure.api.dtos.request;

import com.postechfiap.meu_hospital.core.dtos.CadastrarMedicoInputModel;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.math.BigDecimal;
import java.time.LocalDate;

public record CadastrarMedicoRequestDTO(

        @Schema(description = "Nome completo do médico. Precisa estar preenchido.", example = "José Ricardo")
        @NotBlank(message = "Nome é obrigatório")
        @Size(min = 2, max = 100, message = "Nome deve ter entre 2 e 100 caracteres")
        String nome,

        @Schema(description = "Endereço de e-mail do médico. Precisa estar preenchido e ser válido.", example = "jose.ricardo@meuhospital.com")
        @NotBlank(message = "Email é obrigatório")
        @Email(message = "Email inválido")
        @Size(max = 100, message = "Email deve ter no máximo 100 caracteres")
        String email,


        LocalDate dataNascimento,


        String cpf,

        @Schema(description = "Login para acesso. Precisa estar preenchido.", example = "jose.ricardo")
        @NotBlank(message = "Login é obrigatório")
        @Size(min = 4, max = 50, message = "O login deve ter entre 4 e 50 caracteres")
        String login,

        @Schema(description = "Senha do médico. Precisa estar preenchida e ser forte.", example = "senhaForte123!")
        @NotBlank(message = "Senha é obrigatória")
        @Size(min = 6, max = 100, message = "A senha deve ter entre 6 e 100 caracteres")
        String senha,


        String crm,

        BigDecimal salario

) {

    public CadastrarMedicoInputModel toInputModel(){
        return new  CadastrarMedicoInputModel(
                nome, email, login, senha, dataNascimento, cpf, salario
        );
    }
}
