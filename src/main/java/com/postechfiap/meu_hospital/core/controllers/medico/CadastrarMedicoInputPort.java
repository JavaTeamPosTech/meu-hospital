package com.postechfiap.meu_hospital.core.controllers.medico;

import com.postechfiap.meu_hospital.core.dtos.CadastrarMedicoInputModel;

public interface CadastrarMedicoInputPort {
    void execute(CadastrarMedicoInputModel input);
}
