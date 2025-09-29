package com.postechfiap.meu_hospital.core.domain.usecases.medico.impl;

import com.postechfiap.meu_hospital.core.domain.entities.MedicoDomain;
import com.postechfiap.meu_hospital.core.domain.presenters.medico.BuscarMedicoPorIdOutputPort;
import com.postechfiap.meu_hospital.core.domain.usecases.medico.BuscarMedicoPorIdUseCase;
import com.postechfiap.meu_hospital.core.gateways.MedicoGateway;
import lombok.RequiredArgsConstructor;

import java.util.Optional;
import java.util.UUID;

@RequiredArgsConstructor
public class BuscarMedicoPorIdUseCaseImpl implements BuscarMedicoPorIdUseCase {

    private final BuscarMedicoPorIdOutputPort medicoOutputPort;
    private final MedicoGateway  medicoGateway;

    @Override
    public void execute(UUID id){
        Optional<MedicoDomain> medicoDomain = medicoGateway.buscarPorId(id);

        if (medicoDomain.isEmpty()) {
            medicoOutputPort.presentError("Médico não encontrado.");
            throw new IllegalArgumentException("Médico não encontrado");
        }

        medicoOutputPort.presentSuccess(medicoDomain.get());
    }


}
