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
        Scanner player = new Scanner(System.in);
        System.out.println("Enter your name");
        playerName = player.next();
        playerName = playerName.toUpperCase(Locale.ROOT);
    }

    public void roundNumber() {
        Scanner rounds = new Scanner(System.in);
        System.out.println("Hello, " + playerName + ", how many rounds do you want to play to win?");
        numberOfWinningRounds = rounds.nextInt();
        System.out.println("The number of rounds to win is: " + numberOfWinningRounds);
        System.out.println("\nInstructions: " + playerName + ", use the following keys to play the game: *1* for rock, *2* for paper, *3* for scissors, *x* to end the game, and *n* to start a new game. Let's start!\n");
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
        while (!end) {
            for (int i = 0; i < numberOfWinningRounds; i++) {
                System.out.println("Round: #" + (i + 1) + ". " + playerName + ", make your move!");
                playerMove = playerMove();
                computerMove = computerMove();
                List<Integer> listOfResults = new ArrayList<>();
                int computerWin = 0;
                int playerWin = 0;

                if (playerMove == computerMove) {
                    System.out.println("\nYour move is: *" + moveName + "*, and the computer move is: *" + computerMoveName + "*. It's a tie!");
                    playerWin = playerWin + 1;
                    computerWin = computerWin + 1;
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
                System.out.println("The result is: " + playerWin + ":" + computerWin + "\n");

                System.out.println("The round ended. Type *x* to end the game or type *n* to play again");
                Scanner roundEnd = new Scanner(System.in);
                String roundEndChoice = roundEnd.nextLine();

                if (roundEndChoice.equals("x")) {
                    System.out.println("Are you sure you want to end the game? [Y/N]");
                    Scanner answerX = new Scanner(System.in);
                    String choice = answerX.nextLine();
                    if (choice.equals("Y"))
                        System.out.println("The game is over");
                    end = false;
                    if (choice.equals("N"))
                        System.out.println("A new round will start...");
                    end = true;


                } else if (roundEndChoice.equals("n")) {
                    System.out.println("Are you sure you want to start a new game? [Y/N]");
                    Scanner answerN = new Scanner(System.in);
                    String choice = answerN.nextLine();
                    if (choice.equals("Y"))
                        System.out.println("A new round will start...");
                    end = true;
                    if (choice.equals("N"))
                        System.out.println("The game is over");
                    end = false;
                }

            }
        }
    }
}
