package com.postechfiap.meu_hospital.infrastructure.api.dtos.response;

import java.util.UUID;

public record EnderecoResponseDTO(

        UUID id,
        String estado,
        String cidade,
        String bairro,
        String rua,
        Integer numero,
        String complemento,
        String cep
) {
}
