package rps;

import java.util.*;

public class Logics {
    private int playerMove;
    private int computerMove;
    private String moveName = null;
    private String playerName;
    private String computerMoveName = null;
    private int numberOfWinningRounds;
    private boolean end = false;


    public void gameStart() {
        playerName = UserDialogues.getName();
    }

    public int roundNumber() {
        Scanner rounds = new Scanner(System.in);
        while (true) {
            System.out.println("Hello, " + playerName + ", how many rounds do you want to play to win?");
            String s = rounds.nextLine();
            try {
                int n = Integer.parseInt(s);
                if (n > 0) {
                    System.out.println("The number of winning rounds is: " + n + "\n");
                    numberOfWinningRounds = n;
                    return n;
                } else {
                    System.out.println("The number of rounds must be greater than 0. Try again!\n");
                }
            } catch (Exception e) {
                System.out.println("\n" + playerName + ", only numbers are allowed. Try again!\n");
            }
        }
    }

    public int playerMove() {
        Scanner playerPlay = new Scanner(System.in);
        playerMove = playerPlay.nextInt();
        if (playerMove == 1)
            moveName = "rock";
        else if (playerMove == 2)
            moveName = "paper";
        else if (playerMove == 3)
            moveName = "scissors";
        return playerMove;
    }

    public int computerMove() {
        Random generator = new Random();
        computerMove = generator.nextInt(3) + 1;
        if (computerMove == 1)
            computerMoveName = "rock";
        else if (computerMove == 2)
            computerMoveName = "paper";
        else if (computerMove == 3)
            computerMoveName = "scissors";
        return computerMove;
    }


    public void game() {
        System.out.println("Instructions: " + playerName + ", use the following keys to play the game: *1* for rock, *2* for paper, *3* for scissors. Let's start!\n");
        while (!end) {
            int computerWin = 0;
            int playerWin = 0;

            for (int i = 0; i < numberOfWinningRounds; i++) {
                System.out.println("Round: #" + (i + 1) + ". " + playerName + ", make your move!");
                playerMove = playerMove();
                computerMove = computerMove();

                if (playerMove == computerMove) {
                    System.out.println("Your move is: *" + moveName + "*, and the computer move is also: *" + computerMoveName + "*. It's a tie!");
                    playerWin += 1;
                    computerWin += 1;
                } else if (playerMove == 1 && computerMove == 2) {
                    System.out.println("Your move is: *" + moveName + "*, and the computer move is: *" + computerMoveName + "*. Paper wraps the rock. The computer wins!");
                    playerWin = playerWin + 0;
                    computerWin = computerWin + 1;
                } else if (playerMove == 1 && computerMove == 3) {
                    System.out.println("Your move is: *" + moveName + "*, and the computer move is: *" + computerMoveName + "*. Scissors cut paper. You win!");
                    playerWin = playerWin + 1;
                    computerWin = computerWin + 0;
                } else if (playerMove == 2 && computerMove == 1) {
                    System.out.println("Your move is: *" + moveName + "*, and the computer move is: *" + computerMoveName + "*. Paper wraps the rock. You win!");
                    playerWin = playerWin + 1;
                    computerWin = computerWin + 0;
                } else if (playerMove == 2 && computerMove == 3) {
                    System.out.println("Your move is: *" + moveName + "*, and the computer move is: *" + computerMoveName + "*. Scissors cut paper. The computer wins!");
                    playerWin = playerWin + 0;
                    computerWin = computerWin + 1;
                } else if (playerMove == 3 && computerMove == 1) {
                    System.out.println("Your move is: *" + moveName + "*, and the computer move is: *" + computerMoveName + "*. Rock blunts scissors. The computer wins!");
                    playerWin = playerWin + 0;
                    computerWin = computerWin + 1;
                } else if (playerMove == 3 && computerMove == 2) {
                    System.out.println("Your move is: *" + moveName + "*, and the computer move is: *" + computerMoveName + "*. Scissors cut paper. You win!");
                    playerWin = playerWin + 1;
                    computerWin = computerWin + 0;
                } else {
                    System.out.println("You can only use the following keys to play the game: *1* for rock, *2* for paper, *3* for scissors. Try again.\n");
                    i = i - 1;
                }

                System.out.println("The result is: " + playerWin + " for you and " + computerWin + " for the computer (" + playerWin + ":" + computerWin + ")\n");
            }

//                System.out.println("The round ended with the final result: " + playerWin + " for you and " + computerWin + " for the computer (" + playerWin + ":" + computerWin + "). Type *x* to end the game or type *n* to play again");
            if (playerWin > computerWin) {
                System.out.println("The round ended with the final result: " + playerWin + " for you and " + computerWin + " for the computer (" + playerWin + ":" + computerWin + "). Congratulations, you win!!!\n");
            } else if (playerWin == computerWin) {
                System.out.println("The round ended with the final result: " + playerWin + " for you and " + computerWin + " for the computer (" + playerWin + ":" + computerWin + "). It's a tie!\n");
            } else if (playerWin < computerWin) {
                System.out.println("The round ended with the final result: " + playerWin + " for you and " + computerWin + " for the computer (" + playerWin + ":" + computerWin + "). You lose!!!\n");
            }
            System.out.println("Type *x* to end the game or type *n* to play again\n");

            Scanner roundEnd = new Scanner(System.in);
            String roundEndChoice = roundEnd.nextLine();
            roundEndChoice = roundEndChoice.toLowerCase(Locale.ROOT);

            if (roundEndChoice.equals("x")) {
                System.out.println("Are you sure you want to end the game? [Y/N]");
                Scanner answerX = new Scanner(System.in);
                String choice = answerX.nextLine();
                choice = choice.toUpperCase(Locale.ROOT);
                if (choice.equals("Y")) {
                    System.out.println("The game is over");
                    end = true;
                } else if (choice.equals("N")) {
                    System.out.println("A new round will start...");
                    end = false;
                }

            } else if (roundEndChoice.equals("n")) {
                System.out.println("Are you sure you want to start a new game? [Y/N]");
                Scanner answerN = new Scanner(System.in);
                String choice = answerN.nextLine();
                choice = choice.toUpperCase(Locale.ROOT);
                if (choice.equals("Y")) {
                    System.out.println("A new round will start...");
                    end = false;
                } else if (choice.equals("N")) {
                    System.out.println("The game is over");
                    end = true;
                } else {
                    System.out.println("You entered something else. Try again!");
                    end = false;
                }
            }
        }
    }
}


