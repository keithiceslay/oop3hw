package org.example.sem3;

import java.util.Arrays;
import java.util.List;

public enum RuList {
    А (1, "а"), Б(2, "б"), В(3, "в"), Г(4, "г"), Д(5, "д"),
    Е(6, "е"), Ж(7, "ж"), З(8, "з"), И(9, "и"), Й(10, "й"),
    К(11, "к"), Л(12, "л"), М(13, "м"), Н(14, "н"), О(15, "о"),
    П(16, "п"), Р(17, "р"), С(18, "с"), Т(19, "т"), У(20, "у"),
    Ф(21, "ф"), Х(22, "х"), Ц(23, "ц"), Ч(24, "ч"),
    Ш(25, "ш"), Щ(26, "щ"), Ъ(27, "ъ"), Ы(28, "ы"), Ь(29, "ь"),
    Э(30, "э"), Ю(31, "ю"), Я(32, "я");
    int index;
    String symbol;

    RuList(){}

    RuList (int index, String symbol) {
        this.index = index;
        this.symbol = symbol;
    }

    public int getRuLetter() {
        return index;
    }

    static List<RuList> ruAlph = Arrays.asList(RuList.values());
}
