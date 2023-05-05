package com.home.design.basics.factory;

public class EnemyShipFactory {

	public EnemyShip makeEnemyShip(String newShipType) {
		EnemyShip ship = null;
		if (newShipType.equalsIgnoreCase("U")) {
			return new UFOEnemyShip();
		} else if (newShipType.equalsIgnoreCase("B")) {
			return new BIGUFOEnemyShip();
		} else if (newShipType.equalsIgnoreCase("R")) {
			return new RocketEnemyShip();
		} else {
			return null;
		}
	}

}
