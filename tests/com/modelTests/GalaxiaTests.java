package com.modelTests;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import com.model.Galaxia;

import com.model.InvalidNumberException;

class GalaxiaTests {

		private static Galaxia Galaxia1;
		private static Galaxia Galaxia2;
		private static Galaxia Galaxia3;
		private static Galaxia Galaxia4;
		private static Galaxia Galaxia5;

	int[][] matriz5 = {
			{2,4,4,4,4},
			{2,3,3,4,5},
			{5,2,2,7,1},
			{2,1,3,5,3},
			{2,4,3,1,2}
	};
	int[][] matriz7 = {
			{2,1,2,2,3,2,3},
			{4,2,4,4,4,4,4},
			{3,2,3,3,4,5,3},
			{4,5,2,2,7,1,2},
			{5,2,1,3,5,3,6},
			{4,2,4,3,1,2,0},
			{3,9,9,9,9,2,9},
	};
	int[][] matriz9 = {
			{1,2,3,6,2,3,5,7,0},
			{2,2,1,2,2,3,2,3,1},
			{1,4,2,4,4,4,4,4,1},
			{0,3,2,3,3,4,5,3,2},
			{3,4,5,2,2,7,1,2,3},
			{1,5,2,1,3,5,3,6,1},
			{2,4,2,4,3,1,2,0,2},
			{2,3,9,9,9,9,2,9,3},
			{7,8,4,2,1,0,1,7,5},
	};
	int[][] matrizpar = {
			{2,4,4,4},
			{2,3,3,4},
			{5,2,2,7},
			{2,1,3,5},
			{2,4,3,1}
	};
		
	@BeforeAll
	static void crearGalaxias() {
		try{
			Galaxia1 = new Galaxia(5);
			Galaxia2 = new Galaxia(7);
			Galaxia3 = new Galaxia(9);
			Galaxia4 = new Galaxia(11);
			Galaxia5 = new Galaxia(13);
		}catch(InvalidNumberException e) {
			System.out.println(e.getLocalizedMessage());
		}
	}

	
	
	@Test
	void testEquals() {
		assertFalse(Galaxia1.equals(Galaxia2));
		assertFalse(Galaxia2.equals(Galaxia1));
		assertTrue(Galaxia1.equals(Galaxia1));
		assertTrue(Galaxia2.equals(Galaxia2));

		}
	
	
	}
