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
		// Print Welcome Message
		System.out.println("Welcome in Snake And Ladder Simulator Program");
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
			break;
		case 3:
			System.out.println("Oops! Player got the Snake");
			Player1Position -= random;
		default:
			System.out.println("Something Wrong");

		}
	}
}
