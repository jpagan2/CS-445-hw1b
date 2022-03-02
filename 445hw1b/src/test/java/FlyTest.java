package test.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.java.Fly;
import main.java.Thing;

class FlyTest{
	// String fixtures
	private final static String f_name;	
	
	private final static String t_name;
	private final static String thing_eat;
	private final static String thing_hasEaten;
	
	private final static String move_out;
	private final static String hasNotEaten;
	
	static {
		f_name = "Joshua";
				
		t_name = "Raymond";
		thing_eat = f_name + " Fly has just eaten a Thing" ;
		thing_hasEaten = f_name + " Fly has eaten a Thing";
		
		move_out = f_name + " Fly is buzzing around in flight.";
		hasNotEaten = f_name + " Fly has had nothing to eat!";
	}

	@Test
	void testEatingThingExpectedOutput() {
		Fly fly = new Fly(f_name);
		Thing aThing = new Thing(t_name);
		fly.eat(aThing);
		assertEquals(thing_eat, fly.getCurrentMealLog());
	}
	
	@Test
	void testHasEatenThingExpectedOutput() {
		Fly fly = new Fly(f_name);
		Thing aThing = new Thing(t_name);
		fly.eat(aThing);
		fly.whatDidYouEat();
		assertEquals(thing_hasEaten, fly.getCurrentMealLog());
	}
		
	@Test
	void testMovingExpectedOutput() {
		Fly fly = new Fly(f_name);
		fly.move();
		assertEquals(move_out, fly.getMoveString());
	}
	
	@Test
	void testHasNotEatenAnythingYetExpectedOutput() {
		Fly fly = new Fly(f_name);
		assertEquals(hasNotEaten, fly.getCurrentMealLog());
	}

}