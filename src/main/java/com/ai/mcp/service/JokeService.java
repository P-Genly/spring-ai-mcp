package com.ai.mcp.service;

import com.ai.mcp.client.ChuckNorrisJokeClient;
import com.ai.mcp.model.Joke;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Service;

@Service
public class JokeService {

    private final ChuckNorrisJokeClient chuckNorrisJokeClient;

    public JokeService(ChuckNorrisJokeClient chuckNorrisJokeClient) {
        this.chuckNorrisJokeClient = chuckNorrisJokeClient;
    }

    @Tool(name = "cn_get_random_joke", description = "Get a random joke about Chuck Norris")
    public Joke getRandomJoke() {
        return chuckNorrisJokeClient.getRandomJoke();
    }
}
