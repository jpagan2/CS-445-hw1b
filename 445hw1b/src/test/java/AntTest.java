package test.java;

import org.junit.jupiter.api.Test;

import main.java.Ant;
import main.java.Bat;
import main.java.Fly;
import main.java.Thing;
import main.java.Tiger;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AntTest{
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
		a_name = "Anty";
		ant_eat = a_name+ " Ant has just eaten a Ant" ;
		ant_hasEaten = a_name + " Ant has eaten a Ant";
		
		b_name = "Batman";
		bat_eat = a_name + " Ant has just eaten a Bat" ;
		bat_hasEaten = a_name + " Ant has eaten a Bat";
		
		f_name = "Flyski";
		fly_eat = a_name + " Ant has just eaten a Fly" ;
		fly_hasEaten = a_name + " Ant has eaten a Fly";
		
		t_name = "Thing1";
		thing_eat = a_name + " Ant has just eaten a Thing" ;
		thing_hasEaten = a_name + " Ant has eaten a Thing";
		
		tiger_name = "Eye of Tiger";
		tiger_eat = a_name + " Ant has just eaten a Tiger" ;
		tiger_hasEaten = a_name + " Ant has eaten a Tiger";
		
		move_out = a_name + " Ant is crawling around.";
		hasNotEaten = a_name + " Ant has had nothing to eat!";
	}
		
	@Test
	public void testEatingAntExpectedOutput() {
		Ant ant = new Ant(a_name);
		Ant aAnt = new Ant(a_name);
		ant.eat(aAnt);
		assertEquals(ant_eat, ant.getCurrentMealLog());
	}
	
	@Test
	public void testHasEatenAntExpectedOutput() {
		Ant ant = new Ant(a_name);
		Ant aAnt = new Ant(a_name);
		ant.eat(aAnt);
		ant.whatDidYouEat();
		assertEquals(ant_hasEaten, ant.getCurrentMealLog());
	}
	
	@Test
	public void testEatingBatExpectedOutput() {
		Ant ant = new Ant(a_name);
		Bat aBat = new Bat(b_name);
		ant.eat(aBat);
		assertEquals(bat_eat, ant.getCurrentMealLog());
	}
	
	@Test
	public void testHasEatenBatExpectedOutput() {
		Ant ant = new Ant(a_name);
		Bat aBat = new Bat(b_name);
		ant.eat(aBat);
		ant.whatDidYouEat();
		assertEquals(bat_hasEaten, ant.getCurrentMealLog());
	}
	
	@Test
	public void testEatingFlyExpectedOutput() {
		Ant ant = new Ant(a_name);
		Fly aFly = new Fly(f_name);
		ant.eat(aFly);
		assertEquals(fly_eat, ant.getCurrentMealLog());
	}
	
	@Test
	public void testHasEatenFlyExpectedOutput() {
		Ant ant = new Ant(a_name);
		Fly aFly = new Fly(f_name);
		ant.eat(aFly);
		ant.whatDidYouEat();
		assertEquals(fly_hasEaten, ant.getCurrentMealLog());
	}
	
	@Test
	public void testEatingThingExpectedOutput() {
		Ant ant = new Ant(a_name);
		Thing aThing = new Thing(t_name);
		ant.eat(aThing);
		assertEquals(thing_eat, ant.getCurrentMealLog());
	}
	
	@Test
	public void testHasEatenThingExpectedOutput() {
		Ant ant = new Ant(a_name);
		Thing aThing = new Thing(t_name);
		ant.eat(aThing);
		ant.whatDidYouEat();
		assertEquals(thing_hasEaten, ant.getCurrentMealLog());
	}
	
	@Test
	public void testEatingTigerExpectedOutput() {
		Ant ant = new Ant(a_name);
		Tiger aTiger = new Tiger(tiger_name);
		ant.eat(aTiger);
		assertEquals(tiger_eat, ant.getCurrentMealLog());
	}
	
	@Test
	public void testHasEatenTigerExpectedOutput() {
		Ant ant = new Ant(a_name);
		Tiger aTiger = new Tiger(tiger_name);
		ant.eat(aTiger);
		ant.whatDidYouEat();
		assertEquals(tiger_hasEaten, ant.getCurrentMealLog());
	}
	
	
	@Test
	public void testMovingExpectedOutput() {
		Ant ant = new Ant(a_name);
		ant.move();
		assertEquals(move_out, ant.getMoveString());
	}
	
	@Test
	public void testHasNotEatenAnythingYetExpectedOutput() {
		Ant ant = new Ant(a_name);
		assertEquals(hasNotEaten, ant.getCurrentMealLog());
	}


}