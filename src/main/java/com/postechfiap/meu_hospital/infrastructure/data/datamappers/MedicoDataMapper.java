package com.postechfiap.meu_hospital.infrastructure.data.datamappers;

import com.postechfiap.meu_hospital.core.domain.entities.MedicoDomain;
import com.postechfiap.meu_hospital.infrastructure.model.MedicoEntity;

public interface MedicoDataMapper {
    MedicoEntity toEntity(MedicoDomain medicoDomain);

    MedicoDomain toDomain(MedicoEntity savedEntity);
}
