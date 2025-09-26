package com.postechfiap.meu_hospital.core.domain.usecases.medico.impl;

import com.postechfiap.meu_hospital.core.domain.entities.MedicoDomain;
import com.postechfiap.meu_hospital.core.domain.presenters.medico.CadastrarMedicoOutputPort;
import com.postechfiap.meu_hospital.core.domain.services.PasswordService;
import com.postechfiap.meu_hospital.core.domain.usecases.medico.CadastrarMedicoUseCase;
import com.postechfiap.meu_hospital.core.dtos.CadastrarMedicoInputModel;
import com.postechfiap.meu_hospital.core.gateways.MedicoGateway;
import com.postechfiap.meu_hospital.core.gateways.UsuarioGateway;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CadastrarMedicoUseCaseImpl implements CadastrarMedicoUseCase {

    private final UsuarioGateway usuarioGateway;
    private final MedicoGateway medicoGateway;
    private final PasswordService passwordService;
    private final CadastrarMedicoOutputPort cadastrarMedicoOutputPort;

    @Override
    public MedicoDomain execute(CadastrarMedicoInputModel input) {
        return null;
    }
}
