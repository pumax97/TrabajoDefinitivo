package ejercicioTest;

import org.junit.Before;
import org.junit.Test;

import ejercicio.MinMax;

public class MinMaxTestCajaBlanca {
	int [] xs, xt, xw, xz;
	
	@Before
	
	public void inicializar(){
		xs = new int[] {1, -8, 10, 5, -1, 0};// array para statementCoverage
		xt = null;
		xw = new int[] {};
		xz = new int[] {10};
	}
	
	@Test
	
	public void statementCoverage(){
		MinMax.minMax(xs);//pasa por todas las sentencias
	}
	
	@Test
	
	public void decisionCoverage(){
		MinMax.minMax(xs);//decision verdadera
		MinMax.minMax(xt);//decision falsa
	}
	
	@Test
	
	public void conditionCoverage(){
		MinMax.minMax(xs);//todas las condiciones sean verdaderas
		MinMax.minMax(xw);//condicion if linea 7 sea falsa por tamaño igual a cero
		MinMax.minMax(xz);//condicion for sea falsa 
	}
	
	@Test
	
	public void decisionConditionCoverage(){
		MinMax.minMax(xt);//condicion if linea 7 sea falsa por null
		MinMax.minMax(xs);//todas las condiciones sean verdaderas
		MinMax.minMax(xw);//condicion if linea 7 sea falsa por tamaño igual a cero
		MinMax.minMax(xz);//condicion for sea falsa 
	}
}
