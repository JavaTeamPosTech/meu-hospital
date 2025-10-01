package com.postechfiap.meu_hospital.infrastructure.api.dtos.response;

import io.swagger.v3.oas.annotations.media.Schema;

import java.time.LocalDateTime;
import java.util.UUID;

public record CadastrarPacienteResponseDTO(
        @Schema(description = "ID único do paciente cadastrado")
        UUID id,

        @Schema(description = "Nome completo do paciente")
        String nome,

        @Schema(description = "Endereço de e-mail do paciente")
        String email,

        @Schema(description = "Login do paciente")
        String login,

        @Schema(description = "Data de criação do registro do paciente")
        LocalDateTime dataCriacao,

        @Schema(description = "Mensagem de status da operação")
        String message,

        @Schema(description = "Status da operação (ex: SUCCESS, FAIL)")
        String status
) {
}
