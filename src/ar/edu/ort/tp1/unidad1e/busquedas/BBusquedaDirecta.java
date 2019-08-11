package ar.edu.ort.tp1.unidad1e.busquedas;

public class BBusquedaDirecta {

	private static String [] diasDeLaSemana = {"Lunes", "Martes", "Miercoles", "Jueves", 
			"Viernes", "S�bado", "Domingo"};
	
	public static void main(String[] args) {
		
		System.out.println(obtenerDia(-1));
		System.out.println(obtenerDia(8));
		System.out.println(obtenerDia(1));
	}
	
	//La b�squeda directa consiste en posicionarse en una posici�n predefinda del array,
	//Por ejemplo yo se que el d�a de la semana esta representando como un array de n�meros,
	//por lo que si quiero obtener el d�a Lunes, debo posicionarme sobre el indice 0
	public static String obtenerDia(int i){
		String dia = "No existe un dia con ese n�mero";
		//Siempre debo validar que no se exceda de los l�mites del tama�o y que no sea null
		if(i> diasDeLaSemana.length || i<=0 || diasDeLaSemana[i-1] == null)
			return dia;
		else
			return diasDeLaSemana[i-1];
	}
}