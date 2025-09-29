package com.postechfiap.meu_hospital.core.gateways;

import com.postechfiap.meu_hospital.core.domain.entities.UsuarioDomain;

import java.util.Optional;
import java.util.UUID;

public interface UsuarioGateway {
    boolean existsByLogin(String login);

    boolean existsByEmail(String email);

    Optional<UsuarioDomain> buscarPorId(UUID id);

    boolean existsByCpf(String cpf);
}
