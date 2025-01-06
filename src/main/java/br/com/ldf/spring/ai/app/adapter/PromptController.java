package br.com.ldf.spring.ai.app.adapter;

import br.com.ldf.spring.ai.app.core.service.PromptService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/prompt")
@RequiredArgsConstructor
public class PromptController {

    private final PromptService promptService;

    @GetMapping
    public ResponseEntity<String> getPrompt() {
        return ResponseEntity.ok(promptService.getPrompt());
    }
}
