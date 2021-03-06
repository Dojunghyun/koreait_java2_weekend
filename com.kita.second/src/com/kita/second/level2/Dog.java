package com.kita.second.level2;

public class Dog extends Animal {	
	boolean cutiness;
	
	public Dog(String name, int age) {
		super(name); // Animal(name);
//		super.age = 1;
		this.cutiness = true;
	}
	
	// Overriding
	@Override
	void cry() {
		System.out.println("개가 운다.");
	}
	
	void barking() {
		System.out.println("개가 짖는다.");
	}
}
