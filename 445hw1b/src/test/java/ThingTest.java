package test.java;

import org.junit.jupiter.api.Test;

import main.java.Thing;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ThingTest{
	// String fixtures
	private final static String t_name;
	private final static String stringOut;

	static {
		t_name = "";
		stringOut = t_name;
	}
	
	@Test
	public void testToString() {
		Thing thing = new Thing(t_name);
		assertEquals(stringOut, thing.toString());
	}

}