package com.postechfiap.meu_hospital.core.gateways;

import com.postechfiap.meu_hospital.core.domain.entities.MedicoDomain;

public interface MedicoGateway {
    MedicoDomain cadastrarMedico(MedicoDomain medicoDomain);
}
