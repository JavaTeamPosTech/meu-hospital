package com.postechfiap.meu_hospital.core.gateways;

import com.postechfiap.meu_hospital.core.domain.entities.EnfermeiroDomain;

import java.util.Optional;
import java.util.UUID;

public interface EnfermeiroGateway {
    EnfermeiroDomain cadastrarEnfermeiro(EnfermeiroDomain enfermeiroDomain);

    Optional<EnfermeiroDomain> buscarPorId(UUID id);
}
