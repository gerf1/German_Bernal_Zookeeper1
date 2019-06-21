package com.codingdojo;

public class Gorilla extends Mammal {
	
	
	public void throwSomething() {
		
		energyLevel += 10;
		System.out.println(" [Gorilla has eaten Bananas]-> Increases his energy level to "+energyLevel+" (+10)");

		
	}
	
	public void eatBananas() {
		energyLevel -=5;
		
		System.out.println("[Gorilla has throwing something]-> Decrement his energy level to "+energyLevel+" (-5))");
	}
	
	public void climb() {
		energyLevel -=10;
		System.out.println("[Gorilla has climbed]-> Decrement his energy level to "+energyLevel+" (-10)");

		
	}
}
