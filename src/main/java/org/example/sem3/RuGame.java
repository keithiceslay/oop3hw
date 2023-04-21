package org.example.sem3;

import java.util.ArrayList;
import java.util.List;

import static org.example.sem3.RuList.ruAlph;

public class RuGame extends AbstractGame {
    @Override
    List<String> generateCharList() {
    List<String> charList = new ArrayList<>();
        for (int i = 1; i <= 32; i++)
            for ( RuList letter: ruAlph)
                if (i == letter.index)
                    charList.add(letter.symbol);;
    return charList;
    }
}
