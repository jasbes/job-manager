package com.rocketseat.jobmanager.modules.candidate.controller;

import com.rocketseat.jobmanager.modules.candidate.CandidateEntity;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/api/v1/candidates")
public class CandidateController {
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public CandidateEntity create(@Valid @RequestBody CandidateEntity candidate) {
        log.info("Received candidate: {}", candidate);
        return candidate;
    }
}
