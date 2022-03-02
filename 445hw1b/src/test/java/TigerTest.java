package test.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.java.Ant;
import main.java.Bat;
import main.java.Fly;
import main.java.Thing;
import main.java.Tiger;

class TigerTest{
		
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
	
	private final static String t_name;
	private final static String thing_eat;
	private final static String thing_hasEaten;
	
	private final static String tiger_name;
	private final static String tiger_eat;
	private final static String tiger_hasEaten;
	
	private final static String move_out;
	private final static String hasNotEaten;
	
	static {
		tiger_name = "Andrew";
		tiger_eat = tiger_name + " Tiger has just eaten a Tiger" ;
		tiger_hasEaten = tiger_name + " Tiger has eaten a Tiger";
		
		a_name = "Mary Joy";
		ant_eat = tiger_name + " Tiger has just eaten a Ant" ;
		ant_hasEaten = tiger_name + " Tiger has eaten a Ant";
		
		b_name = "Shereen";
		bat_eat = tiger_name + " Tiger has just eaten a Bat" ;
		bat_hasEaten = tiger_name + " Tiger has eaten a Bat";
		
		f_name = "Joshua";
		fly_eat = tiger_name + " Tiger has just eaten a Fly" ;
		fly_hasEaten = tiger_name + " Tiger has eaten a Fly";
		
		t_name = "Raymond";
		thing_eat = tiger_name + " Tiger has just eaten a Thing" ;
		thing_hasEaten = tiger_name + " Tiger has eaten a Thing";
		
		move_out = tiger_name + " Tiger has just pounced.";
		hasNotEaten = tiger_name + " Tiger has had nothing to eat!";
	}
	
	@Test
	void testEatingAntExpectedOutput() {
		Tiger tiger = new Tiger(tiger_name);
		Ant aAnt = new Ant(a_name);
		tiger.eat(aAnt);
		assertEquals(ant_eat, tiger.getCurrentMealLog());
	}
	
	@Test
	void testHasEatenAntExpectedOutput() {
		Tiger tiger = new Tiger(tiger_name);
		Ant aAnt = new Ant(a_name);
		tiger.eat(aAnt);
		tiger.whatDidYouEat();
		assertEquals(ant_hasEaten, tiger.getCurrentMealLog());
	}
	
	@Test
	void testEatingBatExpectedOutput() {
		Tiger tiger = new Tiger(tiger_name);
		Bat aBat = new Bat(b_name);
		tiger.eat(aBat);
		assertEquals(bat_eat, tiger.getCurrentMealLog());
	}
	
	@Test
	void testHasEatenBatExpectedOutput() {
		Tiger tiger = new Tiger(tiger_name);
		Bat aBat = new Bat(b_name);
		tiger.eat(aBat);
		tiger.whatDidYouEat();
		assertEquals(bat_hasEaten, tiger.getCurrentMealLog());
	}
	
	@Test
	void testEatingFlyExpectedOutput() {
		Tiger tiger = new Tiger(tiger_name);
		Fly aFly = new Fly(f_name);
		tiger.eat(aFly);
		assertEquals(fly_eat, tiger.getCurrentMealLog());
	}
	
	@Test
	void testHasEatenFlyExpectedOutput() {
		Tiger tiger = new Tiger(tiger_name);
		Fly aFly = new Fly(f_name);
		tiger.eat(aFly);
		tiger.whatDidYouEat();
		assertEquals(fly_hasEaten, tiger.getCurrentMealLog());
	}
	
	@Test
	void testEatingThingExpectedOutput() {
		Tiger tiger = new Tiger(tiger_name);
		Thing aThing = new Thing(t_name);
		tiger.eat(aThing);
		assertEquals(thing_eat, tiger.getCurrentMealLog());
	}
	
	@Test
	void testHasEatenThingExpectedOutput() {
		Tiger tiger = new Tiger(tiger_name);
		Thing aThing = new Thing(t_name);
		tiger.eat(aThing);
		tiger.whatDidYouEat();
		assertEquals(thing_hasEaten, tiger.getCurrentMealLog());
	}
	
	@Test
	void testEatingTigerExpectedOutput() {
		Tiger tiger = new Tiger(tiger_name);
		Tiger aTiger = new Tiger(tiger_name);
		tiger.eat(aTiger);
		assertEquals(tiger_eat, tiger.getCurrentMealLog());
	}
	
	@Test
	void testHasEatenTigerExpectedOutput() {
		Tiger tiger = new Tiger(tiger_name);
		Tiger aTiger = new Tiger(tiger_name);
		tiger.eat(aTiger);
		tiger.whatDidYouEat();
		assertEquals(tiger_hasEaten, tiger.getCurrentMealLog());
	}
		
	@Test
	void testMovingExpectedOutput() {
		Tiger tiger = new Tiger(tiger_name);
		tiger.move();
		assertEquals(move_out, tiger.getMoveString());
	}
	
	@Test
	void testHasNotEatenAnythingYetExpectedOutput() {
		Tiger tiger = new Tiger(tiger_name);
		assertEquals(hasNotEaten, tiger.getCurrentMealLog());
	}


}