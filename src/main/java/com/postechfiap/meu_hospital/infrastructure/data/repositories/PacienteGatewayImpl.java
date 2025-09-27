package com.postechfiap.meu_hospital.infrastructure.data.repositories;

import com.postechfiap.meu_hospital.core.domain.entities.PacienteDomain;
import com.postechfiap.meu_hospital.core.gateways.PacienteGateway;
import com.postechfiap.meu_hospital.infrastructure.data.datamappers.PacienteDataMapper;
import com.postechfiap.meu_hospital.infrastructure.model.PacienteEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;
import java.util.UUID;

@RequiredArgsConstructor
@Component
public class PacienteGatewayImpl implements PacienteGateway {

    private final PacienteSpringRepository pacienteSpringRepository;
    private final PacienteDataMapper pacienteDataMapper;

    @Override
    public PacienteDomain cadastrarPaciente(PacienteDomain pacienteDomain) {
        PacienteEntity pacienteEntity = pacienteDataMapper.toEntity(pacienteDomain);
        PacienteEntity pacienteEntitySaved = pacienteSpringRepository.save(pacienteEntity);
        return pacienteDataMapper.toDomain(pacienteEntitySaved);
    }

    @Override
    public Optional<PacienteDomain> buscarPorId(UUID id){
        Optional<PacienteEntity> pacienteEntityOptional = pacienteSpringRepository.findById(id);
        return pacienteEntityOptional.map(pacienteDataMapper::toDomain);
    }

}
