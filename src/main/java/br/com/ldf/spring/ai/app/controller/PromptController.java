package br.com.ldf.spring.ai.app.controller;

import br.com.ldf.spring.ai.app.service.PromptService;
import lombok.RequiredArgsConstructor;
import org.springframework.ai.chat.model.Generation;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/prompt")
@RequiredArgsConstructor
public class PromptController {

    private final PromptService promptService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Generation>> postPrompt(@RequestParam String text) {
        return ResponseEntity.ok(promptService.evaluate(text).getResults());
    }
}
