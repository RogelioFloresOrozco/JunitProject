package com.junitproject.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.junitproject.model.OperacionesVarias;

class OperacionesVariasTest {

	@Test
	void testSumaNumeros1() {
		OperacionesVarias objOperacionesVarias=new OperacionesVarias();
		
		int resultadoObtenido;
		int resultadoEsperado;
		
		objOperacionesVarias.setNumero1(4);
		objOperacionesVarias.setNumero2(2);
		resultadoObtenido=objOperacionesVarias.sumaNumeros();
		
		resultadoEsperado=6;
		
		assertEquals(resultadoEsperado,resultadoObtenido);
		
	}
	@Test
	void testSumaNumeros2() {
		OperacionesVarias objOperacionesVarias=new OperacionesVarias();
		
		int resultadoObtenido;
		boolean mayorEdad;
		
		objOperacionesVarias.setNumero1(18);
		objOperacionesVarias.setNumero2(2);
		
		resultadoObtenido=objOperacionesVarias.sumaNumeros();
		
		if(resultadoObtenido>=18)
		{
			mayorEdad=true;
		}
		else
		{
			mayorEdad=false;
		}
		assertTrue(mayorEdad);
		
	}
	
	//la especificacion me indica que si el usuario deja el textbox vacio sin rellenar el sistema debe de tomarlo como si no pudiera hacer la suma
	@Test
	void testSumaNumeros3()
	{
		int resultadoObtenido;
		int resultadoEsperado;
		
		OperacionesVarias objOperacionesVarias=new OperacionesVarias();
		

		objOperacionesVarias.setNumero1(0);
		objOperacionesVarias.setNumero2(2);
		
		resultadoObtenido=objOperacionesVarias.sumaNumeros();
		
		resultadoEsperado=0;
		assertEquals(resultadoEsperado,resultadoObtenido);
	}
	@Test
	void testSumaNumeros4()
	{
		fail("metodo no implementado");
	}
	@Test
	void testSumaNumeros5()
	{
		OperacionesVarias objOperacionesVarias=new OperacionesVarias();
		
		double resultadoObtenido;
		double resultadoEsperado;
		
		resultadoObtenido=objOperacionesVarias.sumaNumeros(2,3.2);
		resultadoEsperado=5.2;
		
		assertEquals(resultadoEsperado,resultadoObtenido);
	}
}
