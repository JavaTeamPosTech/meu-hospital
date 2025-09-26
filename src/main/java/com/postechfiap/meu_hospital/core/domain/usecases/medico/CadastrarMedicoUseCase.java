package com.postechfiap.meu_hospital.core.domain.usecases.medico;

import com.postechfiap.meu_hospital.core.domain.entities.MedicoDomain;
import com.postechfiap.meu_hospital.core.dtos.CadastrarMedicoInputModel;

public interface CadastrarMedicoUseCase {
    MedicoDomain execute(CadastrarMedicoInputModel input);
}
