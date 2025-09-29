package com.postechfiap.meu_hospital.infrastructure.data.datamappers.impl;

import com.postechfiap.meu_hospital.core.domain.entities.EnderecoDomain;
import com.postechfiap.meu_hospital.infrastructure.data.datamappers.EnderecoDataMapper;
import com.postechfiap.meu_hospital.infrastructure.model.EnderecoEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class EnderecoDataMapperImpl implements EnderecoDataMapper {

    @Override
    public EnderecoEntity toEntity(EnderecoDomain enderecoDomain) {
        if (enderecoDomain == null) {
            return null;
        }

        return new EnderecoEntity(enderecoDomain.getEstado(), enderecoDomain.getCidade(), enderecoDomain.getBairro(),
                enderecoDomain.getRua(), enderecoDomain.getNumero(), enderecoDomain.getComplemento(), enderecoDomain.getCep());
    }


    @Override
    public EnderecoDomain toDomain(EnderecoEntity enderecoEntity) {
        if (enderecoEntity == null) {
            return null;
        }

        return new EnderecoDomain(enderecoEntity.getEstado(), enderecoEntity.getCidade(), enderecoEntity.getBairro(),
                enderecoEntity.getRua(), enderecoEntity.getNumero(), enderecoEntity.getComplemento(), enderecoEntity.getCep());
    }
}
