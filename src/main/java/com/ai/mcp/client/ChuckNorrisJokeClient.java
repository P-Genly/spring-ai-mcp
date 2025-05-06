package com.ai.mcp.client;

import com.ai.mcp.model.Joke;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "chucknorris-joke-client", url = "https://api.chucknorris.io")
public interface ChuckNorrisJokeClient {

    @RequestMapping(method = RequestMethod.GET, value = "/jokes/random")
    Joke getRandomJoke();
}
