package ejercicioTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ejercicio.MinMax;


public class MinMaxTest {
	public int [] xs, xt, xp, xz, xw, xl, xm, xr;
	
	@Before
	
	public void inicializar(){
		xs = null; //array nulo
		xt = new int[] {1}; //array con un único valor
		xp = new int[] {1, 1}; //array esperado para xt
		xz = new int[] {1, 2, 5, 4, 3}; //array con varios valores
		xw = new int[] {1, 5};//array esperado para xz
		xl = new int[] {1, 2, -5, -8, 10};//array con valores negativos
		xm = new int[] {-8, 10};//array esperado para xl
		xr = new int[] {};
	}
	
	@Test
	
	public void arrayNulo(){
		assertEquals("Fallo en la funcion con null", null, MinMax.minMax(xs));
	}
	
	@Test
	
	public void arrayUnValor(){
		assertArrayEquals("Fallo en la funcion con un unico valor", xp, MinMax.minMax(xt));
	}
	
	@Test
	
	public void arrayVariosValores(){
		assertArrayEquals("Fallo en la funcion con varios valores", xw, MinMax.minMax(xz));
	}
	
	@Test
	
	public void arrayValoresEnteros(){
		assertArrayEquals("Fallo en la funcion con valores negativos", xm, MinMax.minMax(xl));
	}
	
	@Test
	
	public void arrayTamanoCero(){
		assertEquals("Fallo en la funcion con array de tamaño cero", null, MinMax.minMax(xr));
	}
}
