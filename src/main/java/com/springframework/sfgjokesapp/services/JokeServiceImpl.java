package com.springframework.sfgjokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

/**
 * Created by Neti on 3/15/2022
 */

@Service
public class JokeServiceImpl implements JokeService{

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeServiceImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
