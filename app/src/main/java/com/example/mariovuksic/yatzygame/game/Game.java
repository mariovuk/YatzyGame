package com.example.mariovuksic.yatzygame.game;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {

	protected ArrayList<Player> players;
	protected Player currentPlayer;
	protected Rule rule = new BottomToTop();
	protected int nbDieToThrow = 5;
	protected int nbOfTurns = 3;

	public Game(ArrayList<Player> players) {
		this.players = players;
		currentPlayer = players.get(0);
	}

	public void play() {
		// choose rule
		
		while (true) { // Need to be changed to the victory condition
			playTurn();

			System.out.println(); // show the combination to achieve

			for (int j = 1; j <= nbOfTurns; j++) {
				System.out.println("\n(" + j + "/" + nbOfTurns + ") Do you want to throw again ? (Y/N)");
				// 3 chances by default
				if (yesOrNo()) {
					removeDie(currentPlayer);
					nbDieToThrow--;
				}
				else
					break;
				playTurn();
			}

			// currentPlayer.achievedCombination();
			changePlayer();
		}
	}

	private void playTurn() {
		currentPlayer.playTurn(nbDieToThrow);
		System.out.println("\n\n(" + currentPlayer.getName() + ")"
				+ " Your hand :\n");
		showHand();
	}

	private void showHand() {
		for (int i = 0; i < 5; i++)
			System.out.print(currentPlayer.getHand()[i].getValue() + " ");
	}

	private void changePlayer() {
		int index = players.indexOf(currentPlayer);

		if (index == players.size() - 1)
			currentPlayer = players.get(0);
		else
			currentPlayer = players.get(++index);
	}

	private void removeDie(Player player) {
		Die[] hand = player.getHand();

		for (int i = 0; i < hand.length; i++) {
			Die die = hand[i];
			System.out.println("Do you want to remove this die : "
					+ die.getValue() + " (Y/N)");
			if (yesOrNo()) {
				player.removeDie(i);
				nbDieToThrow--;
			}
		}
	}

	private boolean yesOrNo() {
		Scanner scan = new Scanner(System.in);
		String answer = scan.nextLine();

		while (true) {
			if (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes"))
				return true;
			else if (answer.equalsIgnoreCase("n")
					|| answer.equalsIgnoreCase("no"))
				return false;
			else {
				answer = scan.nextLine();
			}
		}
	}

}

// Number of players VARIABLE

// /////////////////////////// Play METHOD
// Ask the number of players
// Player chooses a rule
// Start a game with the rules
// Check the scores
// next Turn (Player)

// /////////////////////////// nextTurn METHODS
// next Turn (Player)
// player throw dice
// player keeps some dice or not (Implemented in Player)

