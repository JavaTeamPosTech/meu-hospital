package com.postechfiap.meu_hospital.infrastructure.api.presenters.medico;

import com.postechfiap.meu_hospital.core.domain.entities.MedicoDomain;
import com.postechfiap.meu_hospital.core.domain.presenters.medico.CadastrarMedicoOutputPort;
import com.postechfiap.meu_hospital.infrastructure.api.dtos.response.CadastrarMedicoResponseDTO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Getter
@NoArgsConstructor
public class CadastrarMedicoPresenter implements CadastrarMedicoOutputPort {

        private CadastrarMedicoResponseDTO viewModel;

        @Override
        public void presentSuccess(MedicoDomain medico){
            this.viewModel = new CadastrarMedicoResponseDTO(medico.getId(), medico.getNome(), medico.getEmail(),
                    medico.getLogin(), LocalDateTime.now(), "Médico cadastrado com sucesso.", "SUCCESS");
        }

        @Override
        public void presentError(String message){
            this.viewModel = new CadastrarMedicoResponseDTO(null, null, null, null, null,
                    message, "FAIL");
        }

        public CadastrarMedicoResponseDTO getViewModel() {
            return viewModel;
        }

}
