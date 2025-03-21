package com.model;

public class Principal {

	public static void main(String[] args) {
		try {
			Galaxia g1 = new Galaxia(3);
			System.out.println(g1);
			System.out.println(g1.contarEstrellas());
		} catch (InvalidNumberException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
