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
	
	public int contarLinea(int movimiento,int direccion, boolean bandera) {
		int suma = 0;
		bandera = true;
		// Movimiento hacia la derecha
	    if (direccion == 0) {
	        for (int col = 0; col < galaxia.length; col++) {
	            suma += galaxia[movimiento][col];
	        }
	    } 
	    // Movimiento hacia abajo
	    else if (direccion == 1) {
	        for (int fila = 0; fila < galaxia.length; fila++) {
	            suma += galaxia[fila][movimiento];
	        }
	    } 
	    // Movimiento hacia la izquierda
	    else if (direccion == 2) {
	        for (int col = galaxia.length - 1; col >= 0; col--) {
	            suma += galaxia[movimiento][col];
	        }
	    } 
	    // Movimiento hacia arriba
	    else if (direccion == 3) {
	        for (int fila = galaxia.length - 1; fila >= 0; fila--) {
	            suma += galaxia[fila][movimiento];
	        }
	    }else {
        	bandera = false;
        }
        
        return suma;
	}
	

	@Override
	public String toString() {
		return "Galaxia galaxia=" + Arrays.toString(galaxia) ;
	}

	
}

