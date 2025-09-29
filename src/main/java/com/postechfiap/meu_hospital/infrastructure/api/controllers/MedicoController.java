package com.postechfiap.meu_hospital.infrastructure.api.controllers;

import com.postechfiap.meu_hospital.core.controllers.medico.BuscarMedicoPorIdInputPort;
import com.postechfiap.meu_hospital.core.controllers.medico.CadastrarMedicoInputPort;
import com.postechfiap.meu_hospital.infrastructure.api.dtos.request.CadastrarMedicoRequestDTO;
import com.postechfiap.meu_hospital.infrastructure.api.dtos.response.BuscarMedicoPorIdResponseDTO;
import com.postechfiap.meu_hospital.infrastructure.api.dtos.response.CadastrarMedicoResponseDTO;
import com.postechfiap.meu_hospital.infrastructure.api.presenters.medico.BuscarMedicoPorIdPresenter;
import com.postechfiap.meu_hospital.infrastructure.api.presenters.medico.CadastrarMedicoPresenter;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@Tag(name = "Medico")
@RequestMapping("/medico")
@RequiredArgsConstructor
public class MedicoController {

    private final CadastrarMedicoInputPort cadastrarMedicoInputPort;
    private final CadastrarMedicoPresenter cadastrarMedicoPresenter;

    private final BuscarMedicoPorIdInputPort buscarMedicoPorIdInputPort;
    private final BuscarMedicoPorIdPresenter buscarMedicoPorIdPresenter;

    @Operation(summary = "Realiza o cadastro de um novo usuário do tipo Médico.")
    @PostMapping
    public ResponseEntity<CadastrarMedicoResponseDTO> cadastrarMedico(@RequestBody @Valid CadastrarMedicoRequestDTO cadastrarMedicoRequestDTO) {
        cadastrarMedicoInputPort.execute(cadastrarMedicoRequestDTO.toInputModel());
        CadastrarMedicoResponseDTO responseDTO = cadastrarMedicoPresenter.getViewModel();
        return ResponseEntity.status(HttpStatus.CREATED).body(responseDTO);
    }


    @GetMapping("/{id}")
    public ResponseEntity<BuscarMedicoPorIdResponseDTO> buscarMedicoPorId(@PathVariable UUID id) {
        buscarMedicoPorIdInputPort.execute(id);
        BuscarMedicoPorIdResponseDTO responseDTO = buscarMedicoPorIdPresenter.getViewModel();
        return ResponseEntity.ok(responseDTO);
    }
}
