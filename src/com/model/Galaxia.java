package com.model;

import java.util.Arrays;
import java.util.Random;

public class Galaxia {
	
	private int[][] galaxia;
	
	public Galaxia(int numero) throws InvalidNumberException {
		Random rd = new Random();
		if(numero%2==0||numero<1) {
			throw new InvalidNumberException() ;
		}else {
			this.galaxia= new  int[numero][numero];
		}	
	}
	
	public Galaxia(int[][] matriz) throws InvalidNumberException {
			
			if((matriz.length%2==0 || matriz[0].length<1) && matriz.length==matriz[0].length) {
				throw new InvalidNumberException() ;
			}else {
				this.galaxia=matriz;
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
	

	protected int contarLinea(int posicionColumna , int posicionFila ,int direccion,int movimiento) {
		int suma = 0;
		// Movimiento hacia la derecha
	    if (direccion == 0) {
	        for (int col = posicionColumna; col < movimiento; col++) {
	            suma += galaxia[moverDerecha(posicionColumna)][col];
	        }
	    } 
	    // Movimiento hacia abajo
	    else if (direccion == 1) {
	        for (int fila = posicionFila; fila < movimiento; fila++) {
	            suma += galaxia[fila][moverAbajo(posicionFila)];
	        }
	    } 
	    // Movimiento hacia la izquierda
	    else if (direccion == 2) {
	        for (int col = galaxia.length - 1; col >= 0; col--) {
	            suma += galaxia[moverIzquierda(posicionColumna)][col];
	        }
	    } 
	    // Movimiento hacia arriba
	    else if (direccion == 3) {
	        for (int fila = galaxia.length - 1; fila >= 0; fila--) {
	            suma += galaxia[fila][moverArriba(posicionFila)];
	        }
	    }
	    
        return suma ;
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
	
	protected int calcularMedio(int[][] matriz) {
		return (matriz.length-1)/2;		
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < galaxia.length; i++) {
			sb.append(Arrays.toString(galaxia[i])+"\n");
		}
		return sb.toString();
	}
}

