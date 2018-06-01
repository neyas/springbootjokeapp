package com.neyas.app.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeService {

    private ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeService() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
