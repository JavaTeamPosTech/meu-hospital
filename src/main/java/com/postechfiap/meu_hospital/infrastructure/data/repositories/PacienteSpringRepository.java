package com.postechfiap.meu_hospital.infrastructure.data.repositories;

import com.postechfiap.meu_hospital.infrastructure.model.PacienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PacienteSpringRepository extends JpaRepository<PacienteEntity, UUID> {
}
