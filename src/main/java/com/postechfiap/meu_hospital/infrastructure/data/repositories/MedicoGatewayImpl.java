package com.postechfiap.meu_hospital.infrastructure.data.repositories;

import com.postechfiap.meu_hospital.core.domain.entities.MedicoDomain;
import com.postechfiap.meu_hospital.core.gateways.MedicoGateway;
import com.postechfiap.meu_hospital.infrastructure.data.datamappers.MedicoDataMapper;
import com.postechfiap.meu_hospital.infrastructure.model.MedicoEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MedicoGatewayImpl implements MedicoGateway {

    private final MedicoSpringRepository medicoSpringRepository;
    private final MedicoDataMapper medicoDataMapper;

    @Override
    public MedicoDomain cadastrarMedico(MedicoDomain medicoDomain) {
        MedicoEntity medicoEntity = medicoDataMapper.toEntity(medicoDomain);
        MedicoEntity savedEntity = medicoSpringRepository.save(medicoEntity);
        return medicoDataMapper.toDomain(savedEntity);
    }

}
