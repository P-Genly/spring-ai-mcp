package com.ai.mcp.config;

import com.ai.mcp.service.JokeService;
import org.springframework.ai.tool.ToolCallback;
import org.springframework.ai.tool.ToolCallbacks;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ToolConfiguration {

    @Bean
    public List<ToolCallback> mcpTools(JokeService jokeService) {
        return List.of(ToolCallbacks.from(jokeService));
    }
}
