package com.postechfiap.meu_hospital.core.gateways;

import com.postechfiap.meu_hospital.core.domain.entities.EnderecoDomain;

public interface EnderecoGateway {
    EnderecoDomain cadastrar(EnderecoDomain enderecoDomain);
}
