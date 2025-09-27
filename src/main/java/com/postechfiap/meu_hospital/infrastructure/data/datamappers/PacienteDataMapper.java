package com.postechfiap.meu_hospital.infrastructure.data.datamappers;

import com.postechfiap.meu_hospital.core.domain.entities.PacienteDomain;
import com.postechfiap.meu_hospital.infrastructure.model.PacienteEntity;

public interface PacienteDataMapper {
    PacienteEntity toEntity(PacienteDomain pacienteDomain);

    PacienteDomain toDomain(PacienteEntity pacienteEntity);
}
