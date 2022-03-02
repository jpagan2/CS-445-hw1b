package main.java;

import main.java.Creature;
import main.java.Flyer;
import main.java.Thing;

public class Fly extends Creature implements Flyer{
	private final String moveString;
	

	public Fly(String name) {
		// TODO Auto-generated constructor stub
		super(name);
		moveString = super.toString() + " is buzzing around in flight.";
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		fly();
	}
	
	@Override 
	public void eat(Thing theThing) {
		if (theThing == null || !(theThing instanceof Creature)) {
			super.eat(theThing);
		}
		else {
			System.out.println(super.toString() + " won't eat a " + theThing.getClass().getSimpleName() + ".");
		}

	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println(moveString);
	}
	public String getMoveString() {
		return this.moveString;
	}
}
