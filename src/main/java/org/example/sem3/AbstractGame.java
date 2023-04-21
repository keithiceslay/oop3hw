package org.example.sem3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Random;

import static org.example.sem3.GameStatus.LOSE;
import static org.example.sem3.GameStatus.WIN;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class AbstractGame implements Game {

    Integer sizeWord;
    Integer attempts;
    String word;
    GameStatus gameStatus = GameStatus.INIT;


    @Override
    public void start(Integer sizeWord, Integer attempts) {
        this.sizeWord = sizeWord;
        this.attempts = attempts;
        word = generateWord();//слово загаданное пк
        this.gameStatus = GameStatus.START;
    }


    @Override
    public Answer inputValue(String value) {
        int bulls = 0;
        int cows = 0;
        for (int i = 0; i < value.length(); i++) {
            if (value.charAt(i) == word.charAt(i)) {
                bulls++;
            }
            Character character = value.charAt(i);
            if (word.contains(character.toString())) {
                cows++;
            }
        }
        return new Answer(value, cows, bulls);
    }

    @Override
    public GameStatus getGameStatus(Answer answerGame) {
        turns++;
        this.gameStatus = checkResult(answerGame);
        if (turns > attempts && gameStatus != WIN) {
            this.gameStatus = LOSE;
            System.out.println("Вы не смогли угадать слово " + this.word);
        }
        return this.gameStatus;
    }

    public GameStatus gameStatus() {
        return gameStatus;
    }

    private GameStatus checkResult(Answer answerGame) {
        if (answerGame.bull == sizeWord) {
            this.gameStatus = WIN;
            System.out.println("Вы угадали слово");
        }
        return gameStatus;
    }

    private String generateWord() {
        Random random = new Random();
        List<String> charList = generateCharList();
        String resWord = "";
        for (int i = 0; i < sizeWord; i++) {
            int randomIndex = random.nextInt(charList.size());
            resWord = resWord.concat(charList.get(randomIndex));
            charList.remove(randomIndex);
        }
        return resWord;
    }

    abstract List<String> generateCharList();

    static int turns = 0;
    static int maxTurns = 5;
}
