package com.example.mariovuksic.yatzygame.combinations;

import com.example.mariovuksic.yatzygame.game.Die;

public class TwoPairs extends Combination {

	public TwoPairs(Die[] dice) {
		super(dice);
	}

	protected int pairValue1 = 0;
	protected int pairValue2 = 0;

	@Override
	public boolean checkCombination(int value) {
		boolean check = false;
		
		int i = 1;
		for (Die d : dice) {
			for (int j = i; j < dice.length; j++) 
				if (d.getValue() == dice[j].getValue()) {
					if (pairValue1 == 0)
						pairValue1 = d.getValue();
					else 
						pairValue2 = d.getValue();
					break;
				}
			if (pairValue1 != 0 && pairValue2 != 0)
				break;
			
			i++;
		}
		return check;
	}

	@Override
	public int calculateScore(int value) {
		// TODO Auto-generated method stub
		return 0;
	}

}
