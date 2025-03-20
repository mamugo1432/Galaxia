package com.model;

import java.util.Arrays;

public class Galaxia {
	
	private int[][] galaxia;
	
	public Galaxia(int numero) throws InvalidNumberException {
		
		if(numero%2==0||numero<1) {
			throw new InvalidNumberException() ;
		}else {
			this.galaxia= new  int[numero][numero];
		}
		

		
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
	
	@Override
	public String toString() {
		return "Galaxia [galaxia=" + Arrays.toString(galaxia) + "]";
	}

	
}

