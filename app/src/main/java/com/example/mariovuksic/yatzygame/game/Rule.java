package com.example.mariovuksic.yatzygame.game;

import com.example.mariovuksic.yatzygame.combinations.Combination;

public abstract class Rule {
	
	public boolean checkCombinaison(Player player, Combination combination) {
		return player.getCurrentCombinaison().equals(combination);
	}
	
	public abstract void changeCurrentCombination(Player player, Combination combination);
	
	// public abstract void calculateScore(Player player, Combinaison combinaison);
}
