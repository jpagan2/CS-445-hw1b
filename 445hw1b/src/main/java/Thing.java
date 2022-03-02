package main.java;

public class Thing {
	
	final private String name;
	
	public Thing(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}

	public String toString() {
		String c_name = getClass().getSimpleName();
		if (c_name.equals("Thing")) {
			return name;
		}
		return name + " " + c_name;

	}
}
