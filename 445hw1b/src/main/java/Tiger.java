package main.java;

import main.java.Creature;

public class Tiger extends Creature{
	private final String moveString;
	
	public Tiger(String name) {
		// TODO Auto-generated constructor stub
		super(name);
		moveString = name + " " + this.getClass().getSimpleName() + " has just pounced.";
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println(moveString);
	}
	
	public String getMoveString() {
		return this.moveString;
	}
}