package com.postechfiap.meu_hospital.core.controllers.medico;

import java.util.UUID;

public interface BuscarMedicoPorIdInputPort {
    void execute(UUID id);
}
