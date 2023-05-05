package com.home.design.basics;

import java.util.ArrayList;

public class WorkingWithAnimals {

	public WorkingWithAnimals() {
	}

	public static void main(String[] args) {
		Dog fido = new Dog();
		fido.setName("Fido");
		System.out.println(fido.getName());
		fido.digHole();

		Cat snow = new Cat();
		snow.setName("Snow");
		System.out.println(snow.getName());
		snow.chaseMouse();
		
		ArrayList<Animal> animals = new ArrayList<>();
		Animal doggy = new Dog();
		animals.add(doggy);
		Animal katty = new Cat();
		animals.add(katty);
		for(Animal a : animals) {
			System.out.println(a.getSound());
		}
		
	}
}
