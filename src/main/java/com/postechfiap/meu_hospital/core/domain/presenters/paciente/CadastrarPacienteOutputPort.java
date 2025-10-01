package com.postechfiap.meu_hospital.core.domain.presenters.paciente;

import com.postechfiap.meu_hospital.core.domain.entities.PacienteDomain;

public interface CadastrarPacienteOutputPort {
    void presentSuccess(PacienteDomain paciente);

    void presentError(String message);
}
