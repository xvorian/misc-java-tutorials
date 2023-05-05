package com.home.design.basics.factory;

public abstract class EnemyShip {

	private String name;
	private double amtDamage;

	public EnemyShip() {
		// TODO Auto-generated constructor stub
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
	 * @return the amtDamage
	 */
	public double getAmtDamage() {
		return amtDamage;
	}

	/**
	 * @param amtDamage the amtDamage to set
	 */
	public void setAmtDamage(double amtDamage) {
		this.amtDamage = amtDamage;
	}

	public void followHeroShip() {
		System.out.println("Following the Hero Ship");
	}

	public void displayEnemyShip() {
		System.out.println(getName() + " is on the screen");
	}

	public void enemyShipShoots() {
		System.out.println(getName() + " attack and does " + getAmtDamage());
	}

}
