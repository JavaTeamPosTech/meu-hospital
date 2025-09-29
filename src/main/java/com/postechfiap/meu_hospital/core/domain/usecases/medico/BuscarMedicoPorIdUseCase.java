package com.postechfiap.meu_hospital.core.domain.usecases.medico;

import java.util.UUID;

public interface BuscarMedicoPorIdUseCase {
    void execute(UUID id);
}
