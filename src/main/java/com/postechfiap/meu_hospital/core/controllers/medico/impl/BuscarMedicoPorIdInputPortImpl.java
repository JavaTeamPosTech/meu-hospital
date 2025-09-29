package com.postechfiap.meu_hospital.core.controllers.medico.impl;

import com.postechfiap.meu_hospital.core.controllers.medico.BuscarMedicoPorIdInputPort;
import com.postechfiap.meu_hospital.core.domain.usecases.medico.BuscarMedicoPorIdUseCase;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@RequiredArgsConstructor
public class BuscarMedicoPorIdInputPortImpl implements BuscarMedicoPorIdInputPort {

    private final BuscarMedicoPorIdUseCase  buscarMedicoPorIdUseCase;

    @Override
    public void execute(UUID id){
        buscarMedicoPorIdUseCase.execute(id);
    }

}
