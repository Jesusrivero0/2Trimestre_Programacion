package ejercicios09a11;

public class Test {

	public static void main(String[] args) {
		
		String[] arrayPrueba = new String[] {"Frodo", "Legolas", "Arwen", "Aragorn"};
		String[] arrayVacio = new String[] {} ;
		
		
		
		
		// Probamos ej. 9
		System.out.println("************* TEST 9 **************************");
		ArrayUtils.imprimirArray(arrayPrueba);
		ArrayUtils.imprimirArray(arrayVacio);
		
		// Probamos ej. 10
		System.out.println("************* TEST 10 **************************");
		String palabra = ArrayUtils.obtenerPalabra(arrayPrueba, 2);
		System.out.println(palabra);

		palabra = ArrayUtils.obtenerPalabra(arrayPrueba, 5);
		System.out.println(palabra);		
		
		System.out.println("************* TEST 11 **************************");		
		// Probamos ej. 11
		Integer posicion = ArrayUtils.buscarPalabra(arrayPrueba, palabra);
		System.out.println(posicion);
		
		String nombre ="Aragorn";
		posicion = ArrayUtils.buscarPalabra(arrayPrueba, nombre);
		System.out.println(posicion);
		
		
		posicion = ArrayUtils.buscarPalabra(arrayVacio, nombre);
		System.out.println(posicion);		

	}

}

