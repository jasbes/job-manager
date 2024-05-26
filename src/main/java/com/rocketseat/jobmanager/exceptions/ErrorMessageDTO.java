package com.rocketseat.jobmanager.exceptions;

import lombok.Builder;

@Builder
public record ErrorMessageDTO(String message, String field) {
}
