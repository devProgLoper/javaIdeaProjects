package com.company;

public class Main {

    public static void main(String[] args) {

        int playerPosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Rob", playerPosition);

        playerPosition = calculateHighScorePosition(900);
        displayHighScorePosition("Mike", playerPosition);

        playerPosition = calculateHighScorePosition(400);
        displayHighScorePosition("Bob", playerPosition);

        playerPosition = calculateHighScorePosition(50);
        displayHighScorePosition("Rich", playerPosition);



    public static void displayHighScorePosition ( String playerName, int playerPosition) {
        System.out.println(playerName + " managed to get into position " + playerPosition + " on the high score table");
    }

    public static int calculateHighScorePosition(int score) {
        if (score > 1000) {
            return 1;
        } else if (score > 500 && score < 1000) {
            return 2;
        } else if (score > 100 && score < 500) {
            return 3;
        } else {
            return 4;
        }

    }

}
