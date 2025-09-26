package com.postechfiap.meu_hospital.infrastructure.data.datamappers.impl;

import com.postechfiap.meu_hospital.core.domain.entities.MedicoDomain;
import com.postechfiap.meu_hospital.infrastructure.data.datamappers.MedicoDataMapper;
import com.postechfiap.meu_hospital.infrastructure.model.MedicoEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MedicoDataMapperImpl implements MedicoDataMapper {

    @Override
    public MedicoEntity toEntity(MedicoDomain medicoDomain) {
        if (medicoDomain == null) {
            return null;
        }

        return null;
    }

    @Override
    public MedicoDomain toDomain(MedicoEntity savedEntity) {
        if (savedEntity == null) {
            return null;
        };

        return null;
    }
}
