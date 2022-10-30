package com.axsos.zookeeper2;

public class Bat extends Mammal2{
    public void fly() {
    	System.out.println("the sound of a bat taking off");
    	energyLevel = energyLevel-50;
    }
    public void eatHumans() {
    	System.out.println(" the so- well, never mind");
    	energyLevel = energyLevel+25;
    }
    public void attackTown() {
    	System.out.println(" the sound of a town on fire");
    	energyLevel = energyLevel-100;
    }

}
