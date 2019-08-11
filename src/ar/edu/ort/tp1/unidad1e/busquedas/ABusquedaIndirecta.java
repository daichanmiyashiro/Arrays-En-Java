package ar.edu.ort.tp1.unidad1e.busquedas;

import ar.edu.ort.tp1.unidad1d.recorrerarrays.Persona;

public class ABusquedaIndirecta {
	
	private static Persona [] personas = {new Persona("Juan", 44), new Persona("Pedro", 19),
			new Persona("Carla", 55), new Persona("Daniela", 34), new Persona("Ariel", 70)};

	public static void main(String[] args) {
		int resultado;
		
		resultado = buscarPersona("Ariel");
		if (resultado != -1) {
			System.out.println("El valor buscado est� en la posici�n " + resultado);
		} else {
			System.out.println("El valor buscado no se encuentra en la estructura");
		}
	}
	
	public static int buscarPersona(String nombre){
		int i = 0;
		//En la condici�n del while debemos controlar que estamos dentro del array
		//y la condici�n de b�squeda
		while (i < personas.length && !personas[i].getNombre().equals(nombre)) {
			i++;
		}
		//Si i es igual al length del array, es porque llegue al final y no encontre el elemento
		if (i != personas.length) {
			return i;
		} else {
		//Por convenci�n, cuando una b�squeda que devuelva un �ndice no tenga resultado positivo
		//vamos a devolver un -1. Esto le permite a quien llamo al m�todo, saber si la b�squeda
		//fue exitosa o no
			return -1;
		}
	}
}