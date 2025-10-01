package com.postechfiap.meu_hospital.core.domain.usecases.paciente.impl;

import com.postechfiap.meu_hospital.core.domain.entities.EnderecoDomain;
import com.postechfiap.meu_hospital.core.domain.entities.PacienteDomain;
import com.postechfiap.meu_hospital.core.domain.presenters.paciente.CadastrarPacienteOutputPort;
import com.postechfiap.meu_hospital.core.domain.services.PasswordService;
import com.postechfiap.meu_hospital.core.domain.usecases.paciente.CadastrarPacienteUseCase;
import com.postechfiap.meu_hospital.core.dtos.CadastrarPacienteInputModel;
import com.postechfiap.meu_hospital.core.exceptions.BusinessException;
import com.postechfiap.meu_hospital.core.gateways.PacienteGateway;
import com.postechfiap.meu_hospital.core.gateways.UsuarioGateway;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CadastrarPacienteUseCaseImpl implements CadastrarPacienteUseCase {

    private final UsuarioGateway usuarioGateway;
    private final PacienteGateway pacienteGateway;
    private final PasswordService passwordService;
    private final CadastrarPacienteOutputPort pacienteOutputPort;

    @Override
    public void execute(CadastrarPacienteInputModel inputModel) {
        if (usuarioGateway.existsByLogin(inputModel.getLogin())) {
            pacienteOutputPort.presentError("Login já cadastrado");
            throw new BusinessException("Login já cadastrado");
        }

        if (usuarioGateway.existsByCpf(inputModel.getCpf())) {
            pacienteOutputPort.presentError("CPF já cadastrado.");
            throw new BusinessException("CPF já cadastrado.");
        }

        if (usuarioGateway.existsByEmail(inputModel.getEmail())) {
            pacienteOutputPort.presentError("Email já cadastrado.");
            throw new BusinessException("Email já cadastrado.");
        }

        String senhaCriptografada = passwordService.encryptPassword(inputModel.getSenha());

        EnderecoDomain enderecoDomain = new EnderecoDomain(
                inputModel.getEndereco().getEstado(),
                inputModel.getEndereco().getCidade(),
                inputModel.getEndereco().getBairro(),
                inputModel.getEndereco().getRua(),
                inputModel.getEndereco().getNumero(),
                inputModel.getEndereco().getComplemento(),
                inputModel.getEndereco().getCep()
        );


        PacienteDomain pacienteDomain = new PacienteDomain(
                inputModel.getNome(),
                inputModel.getTelefone(),
                inputModel.getEmail(),
                inputModel.getDataNascimento(),
                inputModel.getCpf(),
                inputModel.getLogin(),
                senhaCriptografada,
                inputModel.getConvenio(),
                inputModel.getNumeroCartaoSaude(),
                enderecoDomain
        );

        PacienteDomain pacienteSalvo = pacienteGateway.cadastrarPaciente(pacienteDomain);
        pacienteOutputPort.presentSuccess(pacienteSalvo);
    }


}
