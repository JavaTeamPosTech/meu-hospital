package com.postechfiap.meu_hospital.core.domain.presenters.medico;

import com.postechfiap.meu_hospital.core.domain.entities.MedicoDomain;

public interface BuscarMedicoPorIdOutputPort {
    void presentSuccess(MedicoDomain medico);

    void presentError(String message);
}
