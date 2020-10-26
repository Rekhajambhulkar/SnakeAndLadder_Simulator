package com.bridgelabz.snakeandladdersimulator;

public class SnakeAndLadderSimulator {
        // Use Random Function to get a dice between 1-6
 	public static int rollDice() {
		return (int) Math.floor(Math.random() * 10) % 6 + 1;
	}

	public static void main(String args[]) {
		//Variable
		int Player1Position = 0;
		// Print Welcome Message
		System.out.println("Welcome in Snake And Ladder Simulator Program");
		int random = rollDice();
		System.out.println(random);
	}
}
