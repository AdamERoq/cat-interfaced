package com.credersi.animals;

import static org.junit.Assert.*;

import org.junit.Test;

public class interfaceTests {
	
	private int stroke(Purr purrer) {
		return purrer.purr();
	}
	
	private int math(Adds added) {
		return added.adds(3, 4);
	}
	
	@Test
	public void testInterfaceAdds() {
		Adds dog = new Dog();
		Adds lynx = new Lynx();
		assertEquals(this.math(lynx), 7);
		assertEquals(this.math(dog), 7);
		
		
	}
	
	@Test
	public void testPurr() {
		Purr cat = new Cat();
		Purr lynx = new Lynx();
		assertEquals(this.stroke(lynx), 30);
		assertEquals(this.stroke(cat), 25);
		
	}
	
	@Test
	public void testLikesWater() {
		Cat cat = new Cat();
		Wolf wolf = new Wolf();
		Dog dog = new Dog();
		assertTrue(dog.likesWater());
		assertTrue(wolf.likesWater());
		assertFalse(cat.likesWater());
	}
	
	@Test
	public void testAdds() {
		Lynx lynx = new Lynx();
		Dog dog = new Dog();
		int dogMath = dog.adds(2, 2);
		int lynxMath = lynx.adds(9, 9);
		assertEquals(lynxMath, 18);
		assertEquals(dogMath, 4);
	}
	
	

}
