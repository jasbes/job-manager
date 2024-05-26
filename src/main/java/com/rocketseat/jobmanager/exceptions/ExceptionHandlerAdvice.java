package com.rocketseat.jobmanager.exceptions;

import lombok.RequiredArgsConstructor;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.List;

@RequiredArgsConstructor
@ControllerAdvice
public class ExceptionHandlerAdvice {

    private final MessageSource messageSource;

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<List<ErrorMessageDTO>> handleException(MethodArgumentNotValidException ex) {
        List<ErrorMessageDTO> errors = ex.getBindingResult().getFieldErrors()
                .stream()
                .map(error ->
                        ErrorMessageDTO.builder()
                                .message(messageSource.getMessage(error, LocaleContextHolder.getLocale()))
                                .field(error.getField())
                                .build()
                ).toList();
        return ResponseEntity.badRequest().body(errors);
    }
}
