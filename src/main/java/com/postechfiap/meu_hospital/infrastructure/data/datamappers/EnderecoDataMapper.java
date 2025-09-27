package com.postechfiap.meu_hospital.infrastructure.data.datamappers;

import com.postechfiap.meu_hospital.core.domain.entities.EnderecoDomain;
import com.postechfiap.meu_hospital.infrastructure.model.EnderecoEntity;

public interface EnderecoDataMapper {
    EnderecoEntity toEntity(EnderecoDomain enderecoDomain);

    EnderecoDomain toDomain(EnderecoEntity enderecoEntity);
}
