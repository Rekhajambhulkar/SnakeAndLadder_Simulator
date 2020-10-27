package com.bridgelabz.snakeandladdersimulator;

public class SnakeAndLadderSimulator {
        // Use Random Function to get a dice between 1-6
 	public static int rollDice() {
		return (int) Math.floor(Math.random() * 10) % 6 + 1;
	}
	// Use CheckOption Function to check Player get a Ladder or snake or player play or not
	public static int checkOption() {
		return (int) Math.floor(Math.random() * 10) % 3 + 1;
	}

	public static void main(String args[]) {
		//Variable
		int Player1Position = 0;
		int Winpoint = 100;
		// Print Welcome Message
		System.out.println("Welcome in Snake And Ladder Simulator Program");
		while(Player1Position < 100){
		int random = rollDice();
		int option = checkOption();
		// Use Switch case for option
		switch (option) {
		case 1:
			System.out.println("Player not play");
			break;
		case 2:
			System.out.println("Player got the Ladder");
			Player1Position += random;
			// In case the Player position go above 100,the player stay in the same previous
				// position till the player gets no that adds to 100.
			if (Player1Position > 100) {
				Player1Position -= random;
			}
			break;
		case 3:
			System.out.println("Oops! Player got the Snake");
			Player1Position -= random;
			// In case the player position moves below 0, then the player restarts from 0
			if (Player1Position < 0) {
				Player1Position = 0;
			} else {
				Player1Position -=random;
			}
			break;
		default:
			System.out.println("Something Wrong");

		}
		System.out.println("Plaer1 position is:" + Player1Position);
		System.out.println();
	}
    }
}
