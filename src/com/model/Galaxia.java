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
	
	public int contarEstrellas() {
		int direccion = 0;
		int movimiento = 1;
		int posicionColumna = calcularMedio(this.galaxia);
		int posicionFila = calcularMedio(this.galaxia);
		int sumaTotal = galaxia[posicionFila][posicionColumna];
		boolean parar = false;
		while (parar = false) {
			try {
				sumaTotal += contarLinea(posicionColumna, posicionFila, direccion, movimiento);
			} catch (ArrayIndexOutOfBoundsException e) {
				sumaTotal += contarLinea(posicionColumna, posicionFila, direccion, movimiento-1);
				parar=true;
			}
			direccion++;
			movimiento++;
		}
		return sumaTotal;
	}
	
	public int contarLinea(int posicionColumna, int posicionFila, int direccion, int movimiento) {
		return 1;
	}
	
	public int calcularMedio(int[][] matriz) {
		return (matriz.length-1)/2;		
	}

	@Override
	public String toString() {
		return "Galaxia galaxia=" + Arrays.toString(galaxia) ;
	}

	
}

