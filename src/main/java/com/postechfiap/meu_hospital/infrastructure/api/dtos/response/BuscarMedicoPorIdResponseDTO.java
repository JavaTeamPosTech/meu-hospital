package com.postechfiap.meu_hospital.infrastructure.api.dtos.response;

import io.swagger.v3.oas.annotations.media.Schema;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

public record BuscarMedicoPorIdResponseDTO(

        UUID id,
        String nome,
        String email,
        String login,
        LocalDate dataNascimento,
        String cpf,
        String crm,
        BigDecimal salario,
        EnderecoResponseDTO endereco,
        @Schema(description = "Mensagem de status da operação")
        String message,

        @Schema(description = "Status da operação (ex: SUCCESS, FAIL)")
        String status
) {
}
