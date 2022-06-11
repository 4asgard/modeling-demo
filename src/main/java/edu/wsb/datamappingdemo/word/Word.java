package edu.wsb.datamappingdemo.word;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Word {
    private final String word;

    public Word(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }
}

