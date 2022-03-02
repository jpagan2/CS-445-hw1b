package test.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.java.Ant;
import main.java.Bat;
import main.java.Fly;
import main.java.Tiger;

class BatTest{
	// String fixtures
	private final static String a_name;
	private final static String ant_eat;
	private final static String ant_hasEaten;

	private final static String b_name;
	private final static String bat_eat;
	private final static String bat_hasEaten;
	
	private final static String f_name;	
	private final static String fly_eat;
	private final static String fly_hasEaten;
	
			
	private final static String tiger_name;
	private final static String tiger_eat;
	private final static String tiger_hasEaten;
	
	private final static String move_out;
	private final static String hasNotEaten;
	
	static {
		b_name = "Batman";
		bat_eat = b_name + " Bat has just eaten a Bat" ;
		bat_hasEaten = b_name + " Bat has eaten a Bat";
		
		a_name = "Anty";
		ant_eat = b_name + " Bat has just eaten a Ant" ;
		ant_hasEaten = b_name + " Bat has eaten a Ant";
		
		f_name = "Flyski";
		fly_eat = b_name + " Bat has just eaten a Fly" ;
		fly_hasEaten = b_name + " Bat has eaten a Fly";
		
		
		tiger_name = "Eye of Tiger";
		tiger_eat = b_name + " Bat has just eaten a Tiger" ;
		tiger_hasEaten = b_name + " Bat has eaten a Tiger";
		
		move_out = b_name + " Bat is swooping through the dark.";
		hasNotEaten = b_name + " Bat has had nothing to eat!";
	}
		
	@Test
	void testEatingAntExpectedOutput() {
		Bat bat = new Bat(b_name);
		Ant aAnt = new Ant(a_name);
		bat.eat(aAnt);
		assertEquals(ant_eat, bat.getCurrentMealLog());
	}
	
	@Test
	void testHasEatenAntExpectedOutput() {
		Bat bat = new Bat(b_name);
		Ant aAnt = new Ant(a_name);
		bat.eat(aAnt);
		bat.whatDidYouEat();
		assertEquals(ant_hasEaten, bat.getCurrentMealLog());
	}
	
	@Test
	void testEatingBatExpectedOutput() {
		Bat bat = new Bat(b_name);
		Bat aBat = new Bat(b_name);
		bat.eat(aBat);
		assertEquals(bat_eat, bat.getCurrentMealLog());
	}
	
	@Test
	void testHasEatenBatExpectedOutput() {
		Bat bat = new Bat(b_name);
		Bat aBat = new Bat(b_name);
		bat.eat(aBat);
		bat.whatDidYouEat();
		assertEquals(bat_hasEaten, bat.getCurrentMealLog());
	}
	
	@Test
	void testEatingFlyExpectedOutput() {
		Bat bat = new Bat(b_name);
		Fly aFly = new Fly(f_name);
		bat.eat(aFly);
		assertEquals(fly_eat, bat.getCurrentMealLog());
	}
	
	@Test
	void testHasEatenFlyExpectedOutput() {
		Bat bat = new Bat(b_name);
		Fly aFly = new Fly(f_name);
		bat.eat(aFly);
		bat.whatDidYouEat();
		assertEquals(fly_hasEaten, bat.getCurrentMealLog());
	}
	
	@Test
	void testEatingTigerExpectedOutput() {
		Bat bat = new Bat(b_name);
		Tiger aTiger = new Tiger(tiger_name);
		bat.eat(aTiger);
		assertEquals(tiger_eat, bat.getCurrentMealLog());
	}
	
	@Test
	void testHasEatenTigerExpectedOutput() {
		Bat bat = new Bat(b_name);
		Tiger aTiger = new Tiger(tiger_name);
		bat.eat(aTiger);
		bat.whatDidYouEat();
		assertEquals(tiger_hasEaten, bat.getCurrentMealLog());
	}
		
	@Test
	void testMovingExpectedOutput() {
		Bat bat = new Bat(b_name);
		bat.move();
		assertEquals(move_out, bat.getMoveString());
	}
	
	@Test
	void testFlyingExpectedOutput() {
		Bat bat = new Bat(b_name);
		bat.fly();
		assertEquals(move_out, bat.getMoveString());
	}
	
	@Test
	void testHasNotEatenAnythingYetExpectedOutput() {
		Bat bat = new Bat(b_name);
		assertEquals(hasNotEaten, bat.getCurrentMealLog());
	}


}