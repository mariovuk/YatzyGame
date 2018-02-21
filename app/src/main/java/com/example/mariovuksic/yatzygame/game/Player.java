package com.example.mariovuksic.yatzygame.game;

import com.example.mariovuksic.yatzygame.combinations.Combination;

public class Player {

	protected int score = 0;
	protected String name;
	protected Combination currentCombination; // Current combination that the
												// player must do
												// Is null if the rule is any
												// order
	protected Die[] hand = new Die[5];

	public Player(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public Die[] getHand() {
		return hand;
	}

	public void throwDice(int nbDie) {
		for (int i = 0; i < hand.length; i++) {
			if (hand[i] == null) {
				Die die = new Die();
				die.throwing();
				hand[i] = die;
			}
		}
	}

	public void setScore(int score) {
		this.score = score;
	}

	public Combination getCurrentCombinaison() {
		return currentCombination;
	}

	public void setCurrentCombinaison(Combination combinaison) {
		currentCombination = combinaison;
	}

	public void playTurn(int nbDie) {
		throwDice(nbDie);
	}

	public String getName() {
		return name;
	}

	public void addDie(int index, Die die) {
		hand[index] = die;
	}

	public void removeDie(int index) {
		hand[index] = null;
	}
	// Tostring

	public void achievedCombination() {
		if (currentCombination.checkCombination(0)); // value depends on the rule
			nextCombination();
	}

	// depends on the rule
	private void nextCombination() {
		
	}
}
