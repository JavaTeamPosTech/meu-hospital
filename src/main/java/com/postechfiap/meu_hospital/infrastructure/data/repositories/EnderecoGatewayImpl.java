package com.postechfiap.meu_hospital.infrastructure.data.repositories;

import com.postechfiap.meu_hospital.core.domain.entities.EnderecoDomain;
import com.postechfiap.meu_hospital.core.gateways.EnderecoGateway;
import com.postechfiap.meu_hospital.infrastructure.data.datamappers.EnderecoDataMapper;
import com.postechfiap.meu_hospital.infrastructure.model.EnderecoEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class EnderecoGatewayImpl implements EnderecoGateway {

    private final EnderecoSpringRepository enderecoSpringRepository;
    private final EnderecoDataMapper  enderecoDataMapper;

    @Override
    public EnderecoDomain cadastrar(EnderecoDomain enderecoDomain) {
        EnderecoEntity enderecoEntity = enderecoDataMapper.toEntity(enderecoDomain);
        EnderecoEntity entitySaved = enderecoSpringRepository.save(enderecoEntity);
        return enderecoDataMapper.toDomain(entitySaved);
    }




}
