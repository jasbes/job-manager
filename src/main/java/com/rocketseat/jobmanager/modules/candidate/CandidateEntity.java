package com.rocketseat.jobmanager.modules.candidate;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import java.util.UUID;

@Data
public class CandidateEntity {
    private UUID id;
    private String name;
    @NotBlank
    private String username;
    @Email
    private String email;
    @Length(min = 8, max = 20)
    private String password;
    private String description;
    private String curriculum;
}
