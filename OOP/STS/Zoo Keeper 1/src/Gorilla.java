
public class Gorilla extends Mammal{
	
	    public void throwSomething() {
	    	System.out.println("gorilla has thrown something");
	    	energyLevel = energyLevel-5;
	    }
	    public void eatBananas() {
	    	System.out.println("the gorilla's satisfaction");
	    	energyLevel = energyLevel+10;
	    }
	    public void climb() {
	    	System.out.println("he gorilla has climbed a tree");
	    	energyLevel = energyLevel-10;
	    }
}
