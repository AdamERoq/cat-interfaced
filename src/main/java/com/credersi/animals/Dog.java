package com.credersi.animals;

public class Dog extends Animal implements Adds, LikesWater {
	
	
	
	public boolean likesWater() {
		// Likes water as true
		return true;
	}

	
	public int adds(int x, int y) {
		// Adds x and y
		return x+y;
	}

}

