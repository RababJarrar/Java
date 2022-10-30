package com.axsos.abstractart;

public class Museum {

	public static void main(String[] args) {
		Painting p1 = new Painting();
		Painting p2 = new Painting();
		Painting p3 = new Painting();
		p1.viewArt();
		p2.viewArt();
		p3.viewArt();
		Sculpture c1 = new Sculpture();
		Sculpture c2 = new Sculpture();
		c1.viewArt();
		c2.viewArt();
	}

}
