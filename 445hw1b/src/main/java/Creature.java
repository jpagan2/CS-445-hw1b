package main.java;

import main.java.Thing;

public abstract class Creature extends Thing{
	
	private Thing recentMeal;
	private String mealLog;
	private boolean justEaten;
	
	public Creature(String name) {
		// TODO Auto-generated constructor stub
		super(name);
		mealLog = super.toString() + " has had nothing to eat!";
	}

	public void eat(Thing theThing) {
		if (theThing == null) {
			throw new NullPointerException("eat() method's argument was null");
		}
		recentMeal = theThing;
		mealLog = super.toString() + " has just eaten a " + theThing.getClass().getSimpleName();
		justEaten = true;
		System.out.println(mealLog);

	}
	
	public abstract void move();

	public void whatDidYouEat() {
		if (justEaten) {
			mealLog = super.toString() + " has eaten a " + recentMeal.getClass().getSimpleName();
			justEaten = false;
		}
		System.out.println(mealLog);
	}
	
	public String getCurrentMealLog() {
		return mealLog;
	}

}
