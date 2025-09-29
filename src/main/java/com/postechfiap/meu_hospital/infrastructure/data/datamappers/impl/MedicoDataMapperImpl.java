package com.postechfiap.meu_hospital.infrastructure.data.datamappers.impl;

import com.postechfiap.meu_hospital.core.domain.entities.EnderecoDomain;
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

        EnderecoDomain enderecoDomain = new EnderecoDomain(
                savedEntity.getEndereco().getId(),
                savedEntity.getEndereco().getEstado(),
                savedEntity.getEndereco().getCidade(),
                savedEntity.getEndereco().getBairro(),
                savedEntity.getEndereco().getRua(),
                savedEntity.getEndereco().getNumero(),
                savedEntity.getEndereco().getComplemento(),
                savedEntity.getEndereco().getCep()
        );


        return new MedicoDomain(savedEntity.getId(), savedEntity.getNome(), savedEntity.getTelefone(), savedEntity.getEmail(),
                savedEntity.getDataNascimento(), savedEntity.getCpf(), savedEntity.getLogin(), savedEntity.getSenha(),
                savedEntity.getCrm(), savedEntity.getSalario(), enderecoDomain);
    }
}
