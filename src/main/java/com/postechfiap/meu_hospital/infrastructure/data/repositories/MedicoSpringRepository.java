package com.postechfiap.meu_hospital.infrastructure.data.repositories;

import com.postechfiap.meu_hospital.infrastructure.model.MedicoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface MedicoSpringRepository  extends JpaRepository<MedicoEntity, UUID> {
}
