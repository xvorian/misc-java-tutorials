package com.home.design.basics;

public class Cat extends Animal {

	private String catLocation = "Close to food";

	public Cat() {
		super();
		setSound("Meow");
	}

	public void chaseMouse() {
		System.out.println("Chase A Mouse...");
	}

	/**
	 * @return the catLocation
	 */
	public String getCatLocation() {
		return catLocation;
	}

	/**
	 * @param catLocation the catLocation to set
	 */
	public void setCatLocation(String catLocation) {
		this.catLocation = catLocation;
	}
}
