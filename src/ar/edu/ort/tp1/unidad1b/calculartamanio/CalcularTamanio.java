package ar.edu.ort.tp1.unidad1b.calculartamanio;

public class CalcularTamanio {

	private static final int CANT_ALUMNOS 	= 6;//Filas
	private static final int CANT_PARCIAES 	= 2;//Columnas
	
	private static String [] diasDeLaSemana = {"Lunes", "Martes", "Miercoles", "Jueves", 
			"Viernes", "S�bado", "Domingo"};

	private static float [][] notasCurso1B = new float[CANT_ALUMNOS][CANT_PARCIAES];
	
	private static char [][] algunasLetras = { { 'A', 'B', 'C', 'D' }, { 'E', 'F' }, { 'G',
		'H', 'I', 'J', 'K', 'L' }, { 'M', 'N' } };
	
	public static void main(String[] args) {
		
		System.out.println("El tama�o del array de dias es de " + diasDeLaSemana.length);
		
		/*
		 * En el caso de un array de 2 dimensiones, el m�todo length nos dar� el tama�o de la primer dimension
		 * (la cantidad de filas).
		 * Para conocer el tama�o de la segunda dimensi�n, debemos acceder al primer elemento de la primera
		 * dimensi�n y llamar al m�todo lenght.
		 */
		System.out.println("El tama�o de la dimension 1 del array de notas es de " + notasCurso1B.length);
		System.out.println("El tama�o de la dimension 2 del array de notas es de " + notasCurso1B[0].length);
		
		/*
		 * IMPORTANTE: Como java permite tener diferentes tama�os en las dimensiones internas, SIEMPRE debemos
		 * verificar la cantidad de columnas de cada fila.
		 * Por ejemplo para el array algunasLetras;
		 */
		for(int i = 0; i < algunasLetras.length; i++){
			System.out.println("La cantidad de columnas para la fila " + i + " es de " + algunasLetras[i].length);
		}
		//�Qu� puede ocurrir si no hacemos esta verificaci�n?
		//System.out.println(algunasLetras[1][4]);
	}
}