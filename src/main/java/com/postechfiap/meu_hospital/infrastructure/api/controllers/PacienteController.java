package com.postechfiap.meu_hospital.infrastructure.api.controllers;

import com.postechfiap.meu_hospital.core.controllers.paciente.CadastrarPacienteInputPort;
import com.postechfiap.meu_hospital.infrastructure.api.dtos.request.CadastrarPacienteRequestDTO;
import com.postechfiap.meu_hospital.infrastructure.api.dtos.response.CadastrarPacienteResponseDTO;
import com.postechfiap.meu_hospital.infrastructure.api.presenters.paciente.CadastrarPacientePresenter;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@Tag(name = "Paciente")
@RestController
@RequestMapping("/paciente")
public class PacienteController {

    private final CadastrarPacienteInputPort cadastroPacienteInputPort;
    private final CadastrarPacientePresenter cadastrarPacientePresenter;



    @Operation(
            summary = "Realiza o cadastro de um novo usuário do tipo Paciente."
    )
    @PostMapping
    public ResponseEntity<CadastrarPacienteResponseDTO> cadastrarPaciente(@RequestBody @Valid CadastrarPacienteRequestDTO cadastrarPacienteRequestDTO) {
        cadastroPacienteInputPort.execute(cadastrarPacienteRequestDTO.toInputModel());
        CadastrarPacienteResponseDTO responseDTO = cadastrarPacientePresenter.getViewModel();

        return ResponseEntity.status(HttpStatus.CREATED).body(responseDTO);
    }
}
