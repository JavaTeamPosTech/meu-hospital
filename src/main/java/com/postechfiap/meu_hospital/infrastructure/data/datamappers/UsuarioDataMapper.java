package com.postechfiap.meu_hospital.infrastructure.data.datamappers;

import com.postechfiap.meu_hospital.core.domain.entities.UsuarioDomain;
import com.postechfiap.meu_hospital.infrastructure.model.UsuarioEntity;

public interface UsuarioDataMapper {
    UsuarioDomain toDomain(UsuarioEntity usuarioEntity);

    UsuarioEntity toEntity(UsuarioDomain usuarioDomain);
}
