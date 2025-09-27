package com.postechfiap.meu_hospital.infrastructure.data.repositories;

import com.postechfiap.meu_hospital.core.domain.entities.UsuarioDomain;
import com.postechfiap.meu_hospital.core.exceptions.ResourceNotFoundException;
import com.postechfiap.meu_hospital.core.gateways.UsuarioGateway;
import com.postechfiap.meu_hospital.infrastructure.data.datamappers.UsuarioDataMapper;
import com.postechfiap.meu_hospital.infrastructure.model.UsuarioEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.security.PublicKey;
import java.util.Optional;
import java.util.UUID;

@RequiredArgsConstructor
@Component
public class UsuarioGatewayImpl implements UsuarioGateway {

    private final UsuarioSpringRepository usuarioSpringRepository;
    private final UsuarioDataMapper usuarioDataMapper;


    @Override
    public boolean existsByLogin(String login) {
        return usuarioSpringRepository.findByLogin(login).isPresent();
    }

    @Override
    public boolean existsByEmail(String email) {
        return usuarioSpringRepository.findByEmail(email).isPresent();
    }

    @Override
    public Optional<UsuarioDomain> buscarPorId(UUID id) {
        Optional<UsuarioEntity> usuarioEntityOptional = usuarioSpringRepository.findById(id);
        return usuarioEntityOptional.map(usuarioDataMapper::toDomain);
    }

    public UsuarioDomain atualizarUsuario(UsuarioDomain usuarioDomain) {
        if (usuarioDomain.getId() == null) {
            throw new IllegalArgumentException("Id do usuário não pode ser nulo para atualização.");
        }

        UsuarioEntity existingUsuario = usuarioSpringRepository.findById(usuarioDomain.getId())
                .orElseThrow(() -> new ResourceNotFoundException("Usuário não encontrado para atualização."));

        return null;
    }
}
