package com.postechfiap.meu_hospital.core.domain.usecases.paciente;

import com.postechfiap.meu_hospital.core.dtos.CadastrarPacienteInputModel;

public interface CadastrarPacienteUseCase {
    void execute(CadastrarPacienteInputModel cadastrarPacienteInputModel);
}
