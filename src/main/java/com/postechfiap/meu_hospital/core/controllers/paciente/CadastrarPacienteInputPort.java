package com.postechfiap.meu_hospital.core.controllers.paciente;

import com.postechfiap.meu_hospital.core.dtos.CadastrarPacienteInputModel;

public interface CadastrarPacienteInputPort {
    void execute(CadastrarPacienteInputModel cadastrarPacienteInputModel);
}
