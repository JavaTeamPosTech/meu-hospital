package com.postechfiap.meu_hospital.infrastructure.api.presenters.paciente;

import com.postechfiap.meu_hospital.core.domain.entities.PacienteDomain;
import com.postechfiap.meu_hospital.core.domain.presenters.paciente.CadastrarPacienteOutputPort;
import com.postechfiap.meu_hospital.infrastructure.api.dtos.response.CadastrarPacienteResponseDTO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Getter
@Component
@NoArgsConstructor
public class CadastrarPacientePresenter implements CadastrarPacienteOutputPort {

    private CadastrarPacienteResponseDTO viewModel;

    @Override
    public void presentSuccess(PacienteDomain paciente){
        this.viewModel = new CadastrarPacienteResponseDTO(paciente.getId(), paciente.getNome(),paciente.getEmail(),
                paciente.getLogin(), LocalDateTime.now(), "Paciente cadastrado com sucesso.", "SUCCESS");
    }

    @Override
    public void presentError(String message){
        this.viewModel = new CadastrarPacienteResponseDTO(null, null, null, null, null,
                message, "FAIL");
    }


}
