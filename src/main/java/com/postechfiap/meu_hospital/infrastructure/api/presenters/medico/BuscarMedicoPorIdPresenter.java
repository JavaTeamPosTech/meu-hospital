package com.postechfiap.meu_hospital.infrastructure.api.presenters.medico;

import com.postechfiap.meu_hospital.core.domain.entities.MedicoDomain;
import com.postechfiap.meu_hospital.core.domain.presenters.medico.BuscarMedicoPorIdOutputPort;
import com.postechfiap.meu_hospital.infrastructure.api.dtos.response.BuscarMedicoPorIdResponseDTO;
import com.postechfiap.meu_hospital.infrastructure.api.dtos.response.EnderecoResponseDTO;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
public class BuscarMedicoPorIdPresenter implements BuscarMedicoPorIdOutputPort {

    private BuscarMedicoPorIdResponseDTO viewModel;

    @Override
    public void presentSuccess(MedicoDomain medico) {

        EnderecoResponseDTO enderecoResponseDTO = new EnderecoResponseDTO(
                medico.getEndereco().getId(), medico.getEndereco().getEstado(), medico.getEndereco().getCidade(),
                medico.getEndereco().getBairro(), medico.getEndereco().getRua(), medico.getEndereco().getNumero(),
                medico.getEndereco().getComplemento(), medico.getEndereco().getCep()
        );

        this.viewModel = new BuscarMedicoPorIdResponseDTO(medico.getId(), medico.getNome(), medico.getEmail(),
                medico.getLogin(), medico.getDataNascimento(), medico.getCpf(), medico.getCrm(), medico.getSalario(), enderecoResponseDTO,
                "Médico encontrado com sucesso.", "SUCCESS");
    }

    @Override
    public void presentError(String message) {
        this.viewModel = new BuscarMedicoPorIdResponseDTO(null, null, null, null, null,
                null, null, null, null, message, "FAIL");
    }

    public BuscarMedicoPorIdResponseDTO getViewModel() {
        return viewModel;
    }
}
