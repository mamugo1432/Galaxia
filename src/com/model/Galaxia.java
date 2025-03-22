package com.model;

import java.util.Arrays;
import java.util.Random;

public class Galaxia {
	
	private int[][] galaxia;
	private int posicionColumna;
	private int posicionFila;
	
	public Galaxia(int numero) throws InvalidNumberException {
		Random rd = new Random();
		if(numero%2==0||numero<1) {
			throw new InvalidNumberException() ;
		}else {
			this.galaxia= new int[numero][numero];
			for (int i = 0; i < galaxia.length; i++) {
				for (int j = 0; j < galaxia[0].length; j++) {
					galaxia[i][j]=rd.nextInt(9)+1;
				}
			}
			this.posicionColumna = calcularMedio(galaxia);
			this.posicionFila = calcularMedio(galaxia);
		}	
	}
	
	public Galaxia(int[][] matriz) throws InvalidNumberException {
			
			if((matriz.length%2==0 || matriz[0].length<1) && matriz.length==matriz[0].length) {
				throw new InvalidNumberException() ;
			}else {
				this.galaxia=matriz;
			}	
		}
	
	private int moverAbajo(int posicionVertical) {
		return posicionVertical+1;
	}

	private int moverIzquierda(int posicionHorizontal) {
		return posicionHorizontal-1;
	}

	private int moverDerecha(int posicionHorizontal) {
		return posicionHorizontal+1;
	}
	
	private int moverArriba(int posicionVertical) {
		
		return posicionVertical-1;
	}
	

	private int contarLinea(int direccion,int movimiento) {
		int suma = 0;
		// Movimiento hacia la derecha
	    if (direccion == 1) {
	        for (int fila = 0; fila < movimiento; fila++) {
	            suma += galaxia[posicionColumna][posicionFila=moverDerecha(posicionFila)];
	        }
	    } 
	    // Movimiento hacia abajo
	    else if (direccion == 2) {
	        for (int col = 0; col < movimiento; col++) {
	            suma += galaxia[posicionColumna=moverAbajo(posicionColumna)][posicionFila];
	        }
	    } 
	    // Movimiento hacia la izquierda
	    else if (direccion == 3) {
	        for (int fila = movimiento; fila > 0; fila--) {
	            suma += galaxia[posicionColumna][posicionFila=moverIzquierda(posicionFila)];
	        }
	    } 
	    // Movimiento hacia arriba
	    else if (direccion == 0) {
	        for (int col = movimiento; col > 0; col--) {
	            suma += galaxia[posicionColumna=moverArriba(posicionColumna)][posicionFila];
	        }
	    }
	    
        return suma ;
	}
	

	public int contarEstrellas() {
		int direccion = 0;
		int movimiento = 1;
		int sumaTotal = galaxia[posicionFila][posicionColumna];
		boolean parar = false;
		while (parar == false) {
			try {
				sumaTotal += contarLinea(direccion, movimiento);
			} catch (ArrayIndexOutOfBoundsException e) {
				sumaTotal += contarLinea(direccion, movimiento-1);
				parar=true;
			}
			direccion = (direccion>=3) ? 0:direccion+1;
			movimiento++;
		}
		return sumaTotal;
	}
	
	private int calcularMedio(int[][] matriz) {
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
	
	@Override
	public boolean equals(Object obj) {
	    return this == obj || (obj instanceof Galaxia && Arrays.deepEquals(this.galaxia, ((Galaxia) obj).galaxia));
	}

}

