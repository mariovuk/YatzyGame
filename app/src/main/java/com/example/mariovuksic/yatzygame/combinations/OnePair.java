package com.example.mariovuksic.yatzygame.combinations;

import com.example.mariovuksic.yatzygame.game.Die;

public class OnePair extends Combination {

	public OnePair(Die[] dice) {
		super(dice);
	}

	protected int pairValue = 0;
	
	@Override
	public boolean checkCombination(int value) {
		boolean check = false;
		
		int i = 1;
		for (Die d : dice) {
			for (int j = i; j < dice.length; j++) 
				if (d.getValue() == dice[j].getValue()) { 
					pairValue = d.getValue();
					check = true;
					break;
				}
			if (check)
				break;
			i++;
		}
		
		return check;
	}

	@Override
	public int calculateScore(int value) {
		return pairValue * 2;
	}

}
