package com.careerit.cj.day20;

 abstract class Game{
	 public Game(){
		 System.out.println("Game constructor");
	 }
	public void start() {
		System.out.println("The game "+this.getClass().getSimpleName()+" is going to start");
	}
    public abstract void play();
	public void stop() {
		System.out.println("The game "+this.getClass().getSimpleName()+" is going to stop");
	}
}

class Car extends Game{
	public Car() {
		super();
		System.out.println("Car constructor");
	}
	
	@Override
	public void play() {
		System.out.println("You are playing car game please wear seat belt...");
	}
}
class Bike extends Game{
	@Override
	public void play() {
		System.out.println("You are playing bike game please wear helmet...");
	}
}
class Ship extends Game{
	@Override
	public void play() {
		System.out.println("You are playing ship game please wear water jacket");
	}
}

abstract class One{
	 void m1() {
		 
	 }
	 public abstract void m2();
}

class Two extends One{
	 @Override
	public void m2() {
	}
}

abstract class C1{
	public abstract void m1();
	public abstract void m2();
	void m3() {
		System.out.println("....");
	}
}

abstract class C2 extends C1{
	@Override
	public void m1() {
			
	}
}
class C3 extends C2{
	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}
}

public class Manager {

		public static void main(String[] args) {
			
				Game game = new Car();
				game.start();
				game.play();
				game.stop();
		}
}
