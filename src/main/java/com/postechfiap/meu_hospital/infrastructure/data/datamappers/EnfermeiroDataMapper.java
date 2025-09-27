package com.postechfiap.meu_hospital.infrastructure.data.datamappers;

import com.postechfiap.meu_hospital.core.domain.entities.EnfermeiroDomain;
import com.postechfiap.meu_hospital.infrastructure.model.EnfermeiroEntity;

public interface EnfermeiroDataMapper {
    EnfermeiroEntity toEntity(EnfermeiroDomain enfermeiroDomain);

    EnfermeiroDomain toDomain(EnfermeiroEntity enfermeiroEntity);
}
