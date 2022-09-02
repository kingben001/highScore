package com.company;


public class Main {

    public static void main(String[] args) {

    int highScorePosition = calculateHighScorePosition(1500);
    displayHighScorePosition("Jim", highScorePosition);

    highScorePosition = calculateHighScorePosition(900);
    displayHighScorePosition("Brian", highScorePosition);

    highScorePosition = calculateHighScorePosition(400);
    displayHighScorePosition("Kenny", highScorePosition);

    highScorePosition = calculateHighScorePosition(50);
    displayHighScorePosition("Matt", highScorePosition);





    }

    public static void displayHighScorePosition (String playersName, int position) {

       System.out.println(playersName + " managed to get into position "
               + position + " on the high score table");

    }

    public static int calculateHighScorePosition(int playerScore) {

//        if (playerScore >= 1000) {
//            return 1;
//        }
//        else if (playerScore >= 500) {
//            return 2;
//        }
//        else if (playerScore >= 100) {
//            return 3;
//        }
//            return 4;
        int position = 4;
        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
                position = 2;
            } else  if (playerScore >= 100) {
            position = 3;
        }

        return position;

        }
    }
