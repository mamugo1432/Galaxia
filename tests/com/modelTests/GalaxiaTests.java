package com.modelTests;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import com.model.Galaxia;

import com.model.Galaxia;
import com.model.InvalidNumberException;
class GalaxiaTests {


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
	
	@Test
	void testGalaxia() {
		fail("Not yet implemented");
	}
	
	@Test
	void testContarEstrellas(){
		assertEquals(41,ContarEstrellas(matriz5));
		assertEquals(54, ContarEstrellas(matriz7));
		assertEquals(114, ContarEstrellas(matriz9));
		assesrnotEquals(0, ContarEstrellas(matriz9));
		assertnotEquals(Intergermaxvalue, ContarEstrellas(matriz9));
		assertnotEquals(-1, ContarEstrellas(matriz9));
	}

	
	class TestGalaxia {
		private static Galaxia Galaxia1;
		private static Galaxia Galaxia2;
		private static Galaxia Galaxia3;
		private static Galaxia Galaxia4;
		private static Galaxia Galaxia5;
		
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
		 void objetoLanzaExcepcion() {
			assertThrows(InvalidNumberException.class, () -> new Galaxia(6));
		}
		
		@Test
		void moverDerechaTest() {
			  assertEquals(6, Galaxia1.moverDerecha(5));
		      assertEquals(1, Galaxia1.moverDerecha(0));
		      assertEquals(-4, Galaxia1.moverDerecha(-5));
		      
		      assertEquals(6, Galaxia2.moverDerecha(5));
		      assertEquals(1, Galaxia2.moverDerecha(0));
		      assertEquals(-4, Galaxia2.moverDerecha(-5));
		      
		      assertEquals(6, Galaxia3.moverDerecha(5));
		      assertEquals(1, Galaxia3.moverDerecha(0));
		      assertEquals(-4, Galaxia3.moverDerecha(-5));
		      
		      assertEquals(6, Galaxia4.moverDerecha(5));
		      assertEquals(1, Galaxia4.moverDerecha(0));
		      assertEquals(-4, Galaxia4.moverDerecha(-5));
		      
		      assertEquals(6, Galaxia5.moverDerecha(5));
		      assertEquals(1, Galaxia5.moverDerecha(0));
		      assertEquals(-4, Galaxia5.moverDerecha(-5));
		}
	}
}