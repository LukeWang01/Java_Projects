package Demo03;

public class Human {
	
	String name;
	int age;
	int height;
	int weight;
	String eyeColor;
	
	// construct method
	
	
	public Human(String name, int age, int height, int weight, String eyeColor) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.eyeColor = eyeColor;
	}
	
	public void speak() {
		System.out.println("My name is " + name);
	}
	
	public void eat() {
		System.out.println("eating");
	}
	
	public void walk() {
		System.out.println("walking");
	}
	
	public void sleep() {
		System.out.println("sleeping");
	}

}
