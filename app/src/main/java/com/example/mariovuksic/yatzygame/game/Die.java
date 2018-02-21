package com.example.mariovuksic.yatzygame.game;

import java.util.Random;

public class Die {

	protected int value;
	
	public int throwing() {
		Random rand = new Random();
		value = rand.nextInt(5)+1;
		
		return value;
	}

	public int getValue() {
		return value;
	}
	
	//Tostring
}
