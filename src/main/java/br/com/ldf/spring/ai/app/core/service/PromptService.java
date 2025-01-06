package br.com.ldf.spring.ai.app.core.service;

import br.com.ldf.spring.ai.app.adapter.dto.InputPromptRequest;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.model.ChatResponse;
import org.springframework.stereotype.Service;

@Service
public class PromptService {

    private final ChatClient client;

    public PromptService(ChatClient.Builder builder) {
        this.client = builder.build();
    }

    public ChatResponse evaluate(InputPromptRequest request) {
        return client.prompt()
                .user(request.text())
                .call()
                .chatResponse();
    }
}
