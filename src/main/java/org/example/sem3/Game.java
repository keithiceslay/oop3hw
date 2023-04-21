package org.example.sem3;

public interface Game {
    void start(Integer sizeWord, Integer attempts);

    Answer inputValue(String value);

    GameStatus getGameStatus(Answer answerGame);

}
