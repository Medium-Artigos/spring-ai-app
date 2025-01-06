package br.com.ldf.spring.ai.app.adapter.controller;

import br.com.ldf.spring.ai.app.adapter.dto.InputPromptRequest;
import br.com.ldf.spring.ai.app.core.service.PromptService;
import lombok.RequiredArgsConstructor;
import org.springframework.ai.chat.model.Generation;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/prompt")
@RequiredArgsConstructor
public class PromptController {

    private final PromptService promptService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Generation>> postPrompt(@RequestBody @Validated InputPromptRequest request) {
        return ResponseEntity.ok(promptService.evaluate(request).getResults());
    }
}
