package com.postechfiap.meu_hospital.core.gateways;

import com.postechfiap.meu_hospital.core.domain.entities.MedicoDomain;

import java.util.Optional;
import java.util.UUID;

public interface MedicoGateway {
    MedicoDomain cadastrarMedico(MedicoDomain medicoDomain);

    Optional<MedicoDomain> buscarPorId(UUID id);
}
