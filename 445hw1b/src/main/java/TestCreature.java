package main.java;

import main.java.Ant;
import main.java.Bat;
import main.java.Creature;
import main.java.Fly;
import main.java.Thing;
import main.java.Tiger;

public class TestCreature {
	
	public static final int THING_COUNT = 12;
	public static final int CREATURE_COUNT = 12;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int index = 0;
		int offset = 0;
		Creature[] c_arr = new Creature[CREATURE_COUNT];
		Thing[] t_arr = new Thing[THING_COUNT];

		
		while (index < (CREATURE_COUNT / 4) + offset) {
			Tiger thisTiger = new Tiger("Tiger" + index);
			t_arr[index] = thisTiger;
			c_arr[index] = thisTiger;
			index++;
		}
		offset = offset + (CREATURE_COUNT / 4);
		while (index < (CREATURE_COUNT / 4) + offset) {
			Ant thisAnt = new Ant("Ant" + index);
			t_arr[index] = thisAnt;
			c_arr[index] = thisAnt;
			index++;
		}
		offset = offset + (CREATURE_COUNT / 4);
		while (index < (CREATURE_COUNT / 4) + offset) {
			Fly thisFly = new Fly("Fly" + index);
			t_arr[index] = thisFly;
			c_arr[index] = thisFly;
			index++;
		}
		offset = offset + (CREATURE_COUNT / 4);
		while (index < (CREATURE_COUNT / 4) + offset) {
			Bat thisBat = new Bat("Bat" + index);
			t_arr[index] = thisBat;
			c_arr[index] = thisBat;
			index++;
		}	
		while (index < THING_COUNT) {
			t_arr[index] = new Thing("Thing" + index);
			index++;
		}
		
		
		
		System.out.println("Things:\n");
				
		for (int i = 0; i < THING_COUNT; i++) {
			if (i == THING_COUNT - 1) {
				System.out.println(t_arr[i] + "\n");
			}
			else {
				System.out.println(t_arr[i]);
			}
		}
				
		System.out.println("Creatures:\n");

		for (int i = 0; i < CREATURE_COUNT; i++) {
			if (i == CREATURE_COUNT - 1) {
				System.out.println(c_arr[i] + "\n");
			}
			else {
				System.out.println(c_arr[i]);
			}
		}
		
		System.out.println("Creature move() method implementation:\n");
		for (int i = 0; i < CREATURE_COUNT; i++) {
			if (i == CREATURE_COUNT - 1) {
				c_arr[i].move();
				System.out.println();
			}
			else {
				c_arr[i].move();
			}
		}
		System.out.println("Creature eat() method implementation:\n");
		for (int i = 0; i < CREATURE_COUNT; i++) {
			if (i == CREATURE_COUNT - 1) {
				c_arr[i].eat(t_arr[i]);
				System.out.println();
			}
			else {
				c_arr[i].eat(t_arr[i]);
			}
		}
		System.out.println("Creature whatDidYouEat() method implementation:\n");
		for (int i = 0; i < CREATURE_COUNT; i++) {
			if (i == CREATURE_COUNT - 1) {
				c_arr[i].whatDidYouEat();
				System.out.println();
			}
			else {
				c_arr[i].whatDidYouEat();
			}
		}

	}

}
