package com.postechfiap.meu_hospital.infrastructure.data.repositories;

import com.postechfiap.meu_hospital.core.domain.entities.EnfermeiroDomain;
import com.postechfiap.meu_hospital.core.gateways.EnfermeiroGateway;
import com.postechfiap.meu_hospital.infrastructure.data.datamappers.EnfermeiroDataMapper;
import com.postechfiap.meu_hospital.infrastructure.model.EnfermeiroEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;
import java.util.UUID;

@RequiredArgsConstructor
@Component
public class EnfermeiroGatewayImpl implements EnfermeiroGateway {

    private final EnfermeiroSpringRepository enfermeiroSpringRepository;
    private final EnfermeiroDataMapper enfermeiroDataMapper;


    @Override
    public EnfermeiroDomain cadastrarEnfermeiro(EnfermeiroDomain enfermeiroDomain) {
        EnfermeiroEntity enfermeiroEntity =  enfermeiroDataMapper.toEntity(enfermeiroDomain);
        EnfermeiroEntity savedEntity = enfermeiroSpringRepository.save(enfermeiroEntity);
        return enfermeiroDataMapper.toDomain(savedEntity);
    }

    @Override
    public Optional<EnfermeiroDomain> buscarPorId(UUID id) {
        Optional<EnfermeiroEntity> enfermeiroEntityOptional = enfermeiroSpringRepository.findById(id);
        return enfermeiroEntityOptional.map(enfermeiroDataMapper::toDomain);
    }
}
