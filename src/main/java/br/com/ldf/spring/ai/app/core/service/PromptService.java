package br.com.ldf.spring.ai.app.core.service;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
public class PromptService {

    private final ChatClient client;

    public PromptService(ChatClient.Builder builder) {
        this.client = builder.build();
    }

    public String getPrompt() {
        return client.prompt()
                .user("tell a joke")
                .call()
                .content();
    }
}
