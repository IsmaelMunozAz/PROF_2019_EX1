package es.upm.grise.profundizacion2019.ex1;

public class ClaseExamen {
	
	public float metodoAProbar(int a, int b) {
		//Nodo 1
		float result = 0;
		//Nodo2
		while( a > b) {
			//Nodo 3
			a--;
		}
		//Nodo 4
		if (a <= b) {
			result = 0;
		}
		//No tiene nodo al no llegar nunca.
		else {
			result = b;
		}
		//Nodo 5
		return result;
	}

}
