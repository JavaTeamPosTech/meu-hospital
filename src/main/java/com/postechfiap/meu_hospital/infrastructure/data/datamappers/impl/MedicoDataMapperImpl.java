package com.postechfiap.meu_hospital.infrastructure.data.datamappers.impl;

import com.postechfiap.meu_hospital.core.domain.entities.MedicoDomain;
import com.postechfiap.meu_hospital.infrastructure.data.datamappers.MedicoDataMapper;
import com.postechfiap.meu_hospital.infrastructure.model.EnderecoEntity;
import com.postechfiap.meu_hospital.infrastructure.model.MedicoEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MedicoDataMapperImpl implements MedicoDataMapper {

    @Override
    public MedicoEntity toEntity(MedicoDomain medicoDomain) {
        if (medicoDomain == null) {
            return null;
        }

        EnderecoEntity enderecoEntity = new EnderecoEntity(
                medicoDomain.getEndereco().getEstado(),
                medicoDomain.getEndereco().getCidade(),
                medicoDomain.getEndereco().getBairro(),
                medicoDomain.getEndereco().getRua(),
                medicoDomain.getEndereco().getNumero(),
                medicoDomain.getEndereco().getComplemento(),
                medicoDomain.getEndereco().getCep()
        );

        return new MedicoEntity(
                medicoDomain.getNome(),
                medicoDomain.getEmail(),
                medicoDomain.getLogin(),
                medicoDomain.getSenha(),
                medicoDomain.getDataNascimento(),
                medicoDomain.getCpf(),
                medicoDomain.getCrm(),
                medicoDomain.getSalario(),
                enderecoEntity
        );
    }

    @Override
    public MedicoDomain toDomain(MedicoEntity savedEntity) {
        if (savedEntity == null) {
            return null;
        };

        return null;
    }
}
