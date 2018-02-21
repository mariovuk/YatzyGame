package com.example.mariovuksic.yatzygame.combinations;

import com.example.mariovuksic.yatzygame.game.Die;

public abstract class Combination {

	protected Die[] dice = new Die[5];
	protected int score;

	public abstract boolean checkCombination(int value); // value is only useful
															// for number
															// combination

	public abstract int calculateScore(int value);

	public Combination(Die[] dice) {
		this.dice = dice;
	}

	// Remove METHOD
}
