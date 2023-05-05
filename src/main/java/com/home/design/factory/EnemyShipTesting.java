package com.home.design.basics.factory;

import java.util.Scanner;

public class EnemyShipTesting {
	
	public static void main(String[] args) {
		// START Old/standard style of working
		EnemyShip ufoShip = new UFOEnemyShip();
		doEnemyStuff(ufoShip);
		// END Old/standard style of working
		
		// factory Pattern
		EnemyShipFactory factory = new EnemyShipFactory();
		EnemyShip ship = null;
		Scanner userInput = new Scanner(System.in);
		System.out.println("What type of Ship? (U/R/B)");
		
		if(userInput.hasNextLine()) {
			ship = factory.makeEnemyShip(userInput.nextLine());
		}
		if(ship!=null) {
			doEnemyStuff(ship);
		}else {
			System.out.println("Please Review & Enter (U/R/B)");
		}
		
	}

	
	public static void doEnemyStuff(EnemyShip enemyShip) {
		enemyShip.displayEnemyShip();
		enemyShip.followHeroShip();
		enemyShip.enemyShipShoots();
	}
	
	public EnemyShipTesting() {
		// TODO Auto-generated constructor stub
	}

}
