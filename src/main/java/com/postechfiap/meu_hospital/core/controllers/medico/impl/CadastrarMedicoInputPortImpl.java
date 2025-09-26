package com.postechfiap.meu_hospital.core.controllers.medico.impl;

import com.postechfiap.meu_hospital.core.controllers.medico.CadastrarMedicoInputPort;
import com.postechfiap.meu_hospital.core.domain.usecases.medico.CadastrarMedicoUseCase;
import com.postechfiap.meu_hospital.core.dtos.CadastrarMedicoInputModel;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CadastrarMedicoInputPortImpl implements CadastrarMedicoInputPort {

    private final CadastrarMedicoUseCase cadastrarMedicoUseCase;

    @Override
    public void execute(CadastrarMedicoInputModel input){

    }

}
