package io.github.alfyorov.chucknorrisjokes.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokesService {

    private final ChuckNorrisQuotes chuckNorrisQuotes = new ChuckNorrisQuotes();

    public JokesService() {
    }

    public String getChuckQuote() {
        return chuckNorrisQuotes.getRandomQuote();
    }

}
