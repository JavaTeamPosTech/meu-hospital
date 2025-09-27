package com.postechfiap.meu_hospital.infrastructure.data.datamappers.impl;

import com.postechfiap.meu_hospital.core.domain.entities.UsuarioDomain;
import com.postechfiap.meu_hospital.infrastructure.data.datamappers.UsuarioDataMapper;
import com.postechfiap.meu_hospital.infrastructure.model.UsuarioEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class UsuarioDataMapperImpl implements UsuarioDataMapper {

    @Override
    public UsuarioDomain toDomain(UsuarioEntity usuarioEntity) {
        if(usuarioEntity == null) return null;
        return new UsuarioDomain(usuarioEntity.getNome(), null, usuarioEntity.getEmail(),
                usuarioEntity.getDataNascimento(), usuarioEntity.getCpf(), usuarioEntity.getLogin(), usuarioEntity.getSenha());
    }

    @Override
    public UsuarioEntity toEntity(UsuarioDomain usuarioDomain) {
        if(usuarioDomain == null) return null;
        return new UsuarioEntity();
    }
}
