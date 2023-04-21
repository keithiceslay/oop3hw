package org.example.sem3;

import java.util.Arrays;
import java.util.List;

public enum EnList {
    A(1, "a"), B(2, "b"), C(3, "c"), D(4, "d"), E(5, "e"),
    F(6, "f"), G(7, "g"), H(8, "h"), I(9, "i"), J(10, "j"),
    K(11, "k"), L(12, "l"), M(13, "m"), N(14, "n"), O(15, "o"),
    P(16, "p"), Q(17, "q"), R(18, "r"), S(19, "s"),  T(20, "t"),
    U(21, "u"), V(22, "v"), W(23, "w"), X(24, "x"), Y(25, "y"),
    Z(26, "z");

    int index;
    String symbol;

    EnList(){}

    EnList(int index, String symbol) {
        this.index = index;
        this.symbol = symbol;
    }

    String returnLetter(int i) {
        String letter = "";
        for (EnList symbol: EnList.values()) {
            if (i == this.index) {
                letter = this.symbol;
                return letter;
            }
        }
        return letter;
    }

    static List<EnList> enAlph = Arrays.asList(EnList.values());

    public int getEngLetter() {
        return index;
    }
}
