package main.java;

import main.java.Creature;

public class Ant extends Creature{
	private final String moveString;
	
	public Ant(String name) {
		// TODO Auto-generated constructor stub
		super(name);
		moveString = super.toString() + " is crawling around.";
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
