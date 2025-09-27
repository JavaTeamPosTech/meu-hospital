package com.postechfiap.meu_hospital.core.gateways;

import com.postechfiap.meu_hospital.core.domain.entities.PacienteDomain;

import java.util.Optional;
import java.util.UUID;

public interface PacienteGateway {
    PacienteDomain cadastrarPaciente(PacienteDomain pacienteDomain);

    Optional<PacienteDomain> buscarPorId(UUID id);
}
