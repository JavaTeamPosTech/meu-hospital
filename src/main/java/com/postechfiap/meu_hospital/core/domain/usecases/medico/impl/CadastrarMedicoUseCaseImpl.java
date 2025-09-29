package com.postechfiap.meu_hospital.core.domain.usecases.medico.impl;

import com.postechfiap.meu_hospital.core.domain.entities.EnderecoDomain;
import com.postechfiap.meu_hospital.core.domain.entities.MedicoDomain;
import com.postechfiap.meu_hospital.core.domain.presenters.medico.CadastrarMedicoOutputPort;
import com.postechfiap.meu_hospital.core.domain.services.PasswordService;
import com.postechfiap.meu_hospital.core.domain.usecases.medico.CadastrarMedicoUseCase;
import com.postechfiap.meu_hospital.core.dtos.CadastrarMedicoInputModel;
import com.postechfiap.meu_hospital.core.exceptions.BusinessException;
import com.postechfiap.meu_hospital.core.gateways.MedicoGateway;
import com.postechfiap.meu_hospital.core.gateways.UsuarioGateway;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CadastrarMedicoUseCaseImpl implements CadastrarMedicoUseCase {

    private final UsuarioGateway usuarioGateway;
    private final MedicoGateway medicoGateway;
    private final PasswordService passwordService;
    private final CadastrarMedicoOutputPort medicoOutputPort;

    @Override
    public MedicoDomain execute(CadastrarMedicoInputModel input) {

        if (usuarioGateway.existsByLogin(input.getLogin())) {
            medicoOutputPort.presentError("Login já cadastrado");
            throw new BusinessException("Login já cadastrado.");
        }

        if (usuarioGateway.existsByEmail(input.getEmail())) {
            medicoOutputPort.presentError("Email já cadastrado");
            throw new BusinessException("Email já cadastrado");
        }

        if (usuarioGateway.existsByCpf(input.getCpf())) {
            medicoOutputPort.presentError("Cpf já cadastrado");
        }

        String senhaCriptografada = passwordService.encryptPassword(input.getSenha());

        EnderecoDomain enderecoDomain = new EnderecoDomain(
                input.getEndereco().getEstado(),
                input.getEndereco().getCidade(),
                input.getEndereco().getBairro(),
                input.getEndereco().getRua(),
                input.getEndereco().getNumero(),
                input.getEndereco().getComplemento(),
                input.getEndereco().getCep()
        );

        MedicoDomain novoMedico = new MedicoDomain(
                input.getNome(),
                input.getTelefone(),
                input.getEmail(),
                input.getDataNascimento(),
                input.getCpf(),
                input.getLogin(),
                senhaCriptografada,
                input.getCrm(),
                input.getSalario(),
                enderecoDomain
        );

        MedicoDomain medicoSalvo = medicoGateway.cadastrarMedico(novoMedico);
        medicoOutputPort.presentSuccess(medicoSalvo);

        return null;
    }
}
