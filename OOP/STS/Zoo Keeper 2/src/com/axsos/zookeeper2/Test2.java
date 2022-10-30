package com.axsos.zookeeper2;

public class Test2 {
	public static void main(String[] args) {
		 Bat h = new Bat();
	        h.attackTown();
	        h.attackTown();
	        h.attackTown();
	        System.out.println(h.displayEnergy());
	        h.eatHumans();
	        h.eatHumans();
	        System.out.println(h.displayEnergy());
	        h.fly();
	        h.fly();
	        System.out.println(h.displayEnergy());
	}
}
