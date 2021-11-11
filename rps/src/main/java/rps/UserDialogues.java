package rps;

import java.util.Scanner;

public class UserDialogues {
    public static String getName() {
        Scanner player = new Scanner(System.in);
        System.out.println("Enter your name");
        return player.next().toUpperCase();
    }
}
