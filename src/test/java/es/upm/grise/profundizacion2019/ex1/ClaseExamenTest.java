package es.upm.grise.profundizacion2019.ex1;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class ClaseExamenTest {

	ClaseExamen claseExamen=new ClaseExamen();
	//Test 1: a=5,b=3
	@Test
	public void test1() {
		float result=0.0f;
		int a=5;
		int b=3;
		assertEquals(result, claseExamen.metodoAProbar(a, b));
	}
	
	//Test 1: a=3,b=3
	@Test
	public void test2() {
		float result=0.0f;
		int a=3;
		int b=3;
		assertEquals(result, claseExamen.metodoAProbar(a, b));
	}
}
