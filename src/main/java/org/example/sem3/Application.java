package org.example.sem3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        System.out.println("1 - цифры\n2 - латиница\n3 - кириллица");
        Scanner scanner = new Scanner(System.in);
        System.out.println("выберите игру: ");
        int num = scanner.nextInt();
        System.out.println("Какую длину слова вы хотите?");
        int wordLength = scanner.nextInt();
        System.out.println("Сколько попыток вы хотите использовать?");
        int attempts = scanner.nextInt();
        Game game = null;
        switch (num) {
            case 1:
                game = new NumberGame();
                game.start(wordLength, attempts);
                break;
            case 2:
                game = new EnGame();
                game.start(wordLength, attempts);
                break;
            case 3:
                game = new RuGame();
                game.start(wordLength, attempts);
                break;
            default:
                System.out.println("данная игра еще не добавлена!");
        }

        while (((AbstractGame) game).gameStatus().equals(GameStatus.START)){
            System.out.println("ход: ");
            String answer = scanner.nextLine();
            Answer answerGame = game.inputValue(answer);
            System.out.println("коров - "+ answerGame.getCow()+" , быков - "+answerGame.getBull());
            game.getGameStatus(answerGame);
        }
    }
}
