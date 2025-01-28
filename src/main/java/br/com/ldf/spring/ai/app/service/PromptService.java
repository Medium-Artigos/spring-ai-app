package br.com.ldf.spring.ai.app.service;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.model.ChatResponse;
import org.springframework.stereotype.Service;

@Service
public class PromptService {

    private final ChatClient client;

    public PromptService(ChatClient.Builder builder) {
        this.client = builder.build();
    }

    public ChatResponse evaluate(String text) {
        return client.prompt()
                .user(text)
                .call()
                .chatResponse();
    }
}
