package org.example.sem3;

import java.util.ArrayList;
import java.util.List;

import static org.example.sem3.EnList.enAlph;

public class EnGame extends AbstractGame{
    @Override
    List<String> generateCharList() {
        List<String> charList = new ArrayList<>();
        for (int i = 1; i <= 26; i++)
            for (EnList letter: enAlph)
                if (i == letter.index)
                    charList.add(letter.symbol);
        return charList;
    }
}
