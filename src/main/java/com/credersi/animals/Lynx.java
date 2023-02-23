package com.credersi.animals;

public class Lynx extends Animal implements Purr, Adds {
	public Lynx() {	}
	
	public int purr() {
		return 30;
	}
	
	public int adds(int x, int y) {
		return x + y;
		
	}
}