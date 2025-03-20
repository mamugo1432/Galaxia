package com.modelTests;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import com.model.Galaxia;
class GalaxiaTests {
	
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
				Galaxia3 = new Galaxia(9;
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
		}
	}
}
