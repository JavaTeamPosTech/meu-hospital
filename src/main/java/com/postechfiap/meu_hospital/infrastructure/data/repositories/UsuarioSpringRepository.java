package com.postechfiap.meu_hospital.infrastructure.data.repositories;

import com.postechfiap.meu_hospital.infrastructure.model.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface UsuarioSpringRepository extends JpaRepository<UsuarioEntity, UUID> {
    Optional<UsuarioEntity> findByLogin(String login);
    Optional<UsuarioEntity> findByEmail(String email);
}
