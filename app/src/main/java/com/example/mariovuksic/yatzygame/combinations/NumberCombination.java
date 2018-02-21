package com.example.mariovuksic.yatzygame.combinations;

import com.example.mariovuksic.yatzygame.game.Die;

public class NumberCombination extends Combination {

	public NumberCombination(Die[] dice) {
		super(dice);
	}

	public boolean checkCombination(int value) {
		boolean check = true;
		
		for (Die d : dice) {
			if (d.getValue() != value) {
				check = false;
				break;
			}
		}
		
		return check;
	}

	public int calculateScore(int value) {
		for (Die d : dice) {
			if (d.getValue() == value)
				score += value;
		}
		
		return value;
	}
}
