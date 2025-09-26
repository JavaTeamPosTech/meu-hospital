package com.postechfiap.meu_hospital.core.domain.presenters.medico;

import com.postechfiap.meu_hospital.core.domain.entities.MedicoDomain;

public interface CadastrarMedicoOutputPort {
    void presentSuccess(MedicoDomain medico);

    void presentError(String message);
}
