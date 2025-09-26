package com.postechfiap.meu_hospital.core.domain.usecases.medico.impl;

import com.postechfiap.meu_hospital.core.domain.entities.MedicoDomain;
import com.postechfiap.meu_hospital.core.domain.usecases.medico.CadastrarMedicoUseCase;
import com.postechfiap.meu_hospital.core.dtos.CadastrarMedicoInputModel;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CadastrarMedicoUseCaseImpl implements CadastrarMedicoUseCase {


    @Override
    public MedicoDomain execute(CadastrarMedicoInputModel input) {
        return null;
    }
}
