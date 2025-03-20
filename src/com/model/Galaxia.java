package com.model;

public class Galaxia {

	public Galaxia() {
		private int[][] galaxia;
	
	public Galaxia(int numero) throws InvalidNumberException {
		
		if(numero%2==0||numero<1) {
			throw new InvalidNumberException() ;
		}else {
			this.galaxia= new  int[numero][numero];
		}
		
 
	}

}
