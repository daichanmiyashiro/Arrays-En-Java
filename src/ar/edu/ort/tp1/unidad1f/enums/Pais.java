package ar.edu.ort.tp1.unidad1f.enums;

/*
 * Un enum es como una clase, tiene atributos y m�todos.
 * La �nica diferencia es que siempre ser�n publicos, estaticos y finales
 */

public enum Pais {
	FRANCIA,
	BRASIL,
	URUGUAY,
	PARAGUAY,
	VENEZUELA,
	CHILE,
	COLOMBIA;
	
	/*
	 * Puedo agregar m�todos como si fuese una clase.
	 * Por ejemplo puedo sobreescribir el m�todo toString
	 */
	@Override
	public String toString() {
		return "Pais: " + name();
	}
}