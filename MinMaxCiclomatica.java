package ejercicioTest;

import org.junit.Before;
import org.junit.Test;

import ejercicio.MinMax;

public class MinMaxCiclomatica {
	int [] xs, xt, xz, xw, xy;
	
	@Before
	
	public void inicializar(){
		xs = null;
		xt = new int[] {2};
		xz = new int[] {1, 2};
		xw = new int[] {4, 4};
		xy = new int[] {4, 1};
	}
	
	@Test
	
	public void caminoUno(){ //1-2-3-12
		MinMax.minMax(xs);
	}
	
	@Test
	
	public void caminoDos(){ //1-2-3-4-5-11-12
		MinMax.minMax(xt);
	}
	
	@Test
	
	public void caminoTres(){ //1-2-3-4-5-6-7-8-5-11-12
		MinMax.minMax(xz);
	}
	
	@Test
	
	public void caminoCuatro(){ //1-2-3-4-5-6-7-9-5-11-12
		MinMax.minMax(xw);
	}
	
	@Test
	
	public void caminoCinco(){ //1-2-3-4-5-6-7-9-10-5-11-12
		MinMax.minMax(xy);
	}
}
