package com.model;

public class Galaxia {

	public Galaxia() {
		
		
		
	}
	protected int moverAbajo(int posicionVertical) {

		return posicionVertical--;
	}

	
	protected int moverIzquierda(int posicionHorizontal) {

		return posicionHorizontal--;
	}

		protected int moverDerecha(int posicionHorizontal) {
		
		return posicionHorizontal++;
	}
	
	protected int moverArriba(int posicionVertical) {
		
		return posicionVertical++;
	}
}
