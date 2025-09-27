package com.postechfiap.meu_hospital.infrastructure.data.datamappers.impl;

import com.postechfiap.meu_hospital.core.domain.entities.EnfermeiroDomain;
import com.postechfiap.meu_hospital.infrastructure.data.datamappers.EnfermeiroDataMapper;
import com.postechfiap.meu_hospital.infrastructure.model.EnfermeiroEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class EnfermeiroDataMapperImpl implements EnfermeiroDataMapper {

    @Override
    public EnfermeiroEntity toEntity(EnfermeiroDomain enfermeiroDomain) {
        if(enfermeiroDomain == null) return null;

        return new EnfermeiroEntity();
    }

    @Override
    public EnfermeiroDomain toDomain(EnfermeiroEntity enfermeiroEntity) {
        if(enfermeiroEntity == null) return null;

        return new EnfermeiroDomain();
    }
}
