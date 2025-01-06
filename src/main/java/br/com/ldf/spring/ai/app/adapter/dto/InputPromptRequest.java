package br.com.ldf.spring.ai.app.adapter.dto;

import jakarta.validation.constraints.NotBlank;

public record InputPromptRequest(
   @NotBlank
   String text
) {}
