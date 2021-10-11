package com.careerit.cj.day21;

import java.util.concurrent.ThreadLocalRandom;

interface Game {
		public static final String barndName = "LWL";
		abstract void start();
		void play();
		void stop();
		
		
}
 abstract class AbstractGame implements Game{
	public void start() {
		System.out.println(this.getClass().getSimpleName()+" game is going to start");
	
	}
	public void stop() {
		System.out.println(this.getClass().getSimpleName()+" game is going to stop");
	}
}
class Car extends AbstractGame implements Game{
	
		
		public void play() {
			System.out.println("You are playing Car game, please wear seat belt...");
		}
	
		
}

class Bike extends AbstractGame implements Game{

	
	public void play() {
		System.out.println("You are playing Bike game, please wear helmet....");
	}
	
}
class Ship extends AbstractGame implements Game{

	public void play() {
		System.out.println("You are playing Ship game, please wear water jacket....");
	}

	
}


public class GameManager{
	
	public static void main(String[] args) {
     		Game game = getRandomGame();
			game.start();
			game.play();
			game.stop();
	}

	private static Game getRandomGame() {
		
		int num = ThreadLocalRandom.current().nextInt(1, 4);
		if(num == 1) {
			return new Bike();
		}else if(num == 2) {
			return new Car();
		}else if(num == 3) {
			return new Ship();
		}
		return null;
	}
}