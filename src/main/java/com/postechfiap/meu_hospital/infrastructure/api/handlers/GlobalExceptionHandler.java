package com.postechfiap.meu_hospital.infrastructure.api.handlers;

import com.postechfiap.meu_hospital.infrastructure.api.dtos.response.ExcecaoDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<ExcecaoDTO> handleIllegalArgumentException(IllegalArgumentException e){
        int status = HttpStatus.BAD_REQUEST.value();
        ExcecaoDTO excecaoDTO = new ExcecaoDTO(e.getMessage(), status);

        return ResponseEntity.status(status).body(excecaoDTO);
    }
}
