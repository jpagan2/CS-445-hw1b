package main.java;

import main.java.Creature;
import main.java.Flyer;
import main.java.Thing;

public class Bat extends Creature implements Flyer{
	private final String moveString;
	
	public Bat(String name) {
		// TODO Auto-generated constructor stub
		super(name);
		moveString = super.toString() + " is swooping through the dark.";
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		fly();
	}
	
	@Override
	public void eat(Thing theThing) {
		if (theThing == null || theThing instanceof Creature) {
			super.eat(theThing);
		}
	}

	@Override
	public void fly() {
		System.out.println(moveString);
	}
	
	public String getMoveString() {
		return this.moveString;
	}


}
