package com.postechfiap.meu_hospital.infrastructure.data.datamappers.impl;

import com.postechfiap.meu_hospital.core.domain.entities.PacienteDomain;
import com.postechfiap.meu_hospital.infrastructure.data.datamappers.PacienteDataMapper;
import com.postechfiap.meu_hospital.infrastructure.model.PacienteEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PacienteDataMapperImpl implements PacienteDataMapper {

    @Override
    public PacienteEntity toEntity(PacienteDomain pacienteDomain) {
        if(pacienteDomain == null) {
            return null;
        }
        return new PacienteEntity();
    }

    @Override
    public PacienteDomain toDomain(PacienteEntity pacienteEntity) {
        if(pacienteEntity == null) {
            return null;
        }

        return new PacienteDomain();
    }
}
