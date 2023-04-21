package org.example.sem3;

import java.util.ArrayList;
import java.util.List;

import static org.example.sem3.GameStatus.START;

public class NumberGame extends AbstractGame {
    @Override
    List<String> generateCharList() {
        List<String> charList = new ArrayList<>();
        for (int i = 0; i <= 9; i++) {
            charList.add(String.valueOf(i));
        }
        return charList;
    }

}

