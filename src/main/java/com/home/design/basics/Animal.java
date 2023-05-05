package com.home.design.basics;

public class Animal {
	private String name;
	private double height;
	private int weight;
	private String sound;

	public Animal() {
		System.out.println("Animal Default Constructor");
	}
	
	/**
	 * @param name
	 * @param height
	 * @param weight
	 * @param sound
	 */
	public Animal(String name, double height, int weight, String sound) {
		super();
		System.out.println("Animal Extended Constructor");
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.sound = sound;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(double height) {
		this.height = height;
	}

	/**
	 * @return the weight
	 */
	public int getWeight() {
		return weight;
	}

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(int weight) {
		this.weight = weight;
	}

	/**
	 * @return the sound
	 */
	public String getSound() {
		return sound;
	}

	/**
	 * @param sound the sound to set
	 */
	public void setSound(String sound) {
		this.sound = sound;
	}

}
