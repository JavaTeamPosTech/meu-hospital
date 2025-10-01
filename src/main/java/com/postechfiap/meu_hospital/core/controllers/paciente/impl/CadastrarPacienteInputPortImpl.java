package com.postechfiap.meu_hospital.core.controllers.paciente.impl;

import com.postechfiap.meu_hospital.core.controllers.paciente.CadastrarPacienteInputPort;
import com.postechfiap.meu_hospital.core.domain.usecases.paciente.CadastrarPacienteUseCase;
import com.postechfiap.meu_hospital.core.dtos.CadastrarPacienteInputModel;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CadastrarPacienteInputPortImpl implements CadastrarPacienteInputPort {

    private final CadastrarPacienteUseCase cadastrarPacienteUseCase;

    @Override
    public void execute(CadastrarPacienteInputModel cadastrarPacienteInputModel) {
        cadastrarPacienteUseCase.execute(cadastrarPacienteInputModel);
    }


}
