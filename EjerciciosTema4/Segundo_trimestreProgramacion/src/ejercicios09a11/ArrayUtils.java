package ejercicios09a11;

public class ArrayUtils {

	/**
	 * Imprime el contenido de un array de cadenas
	 * @param array Array de cadenas a imprimir
	 */
	public static void imprimirArray(String[] array) {
		for (String cadena : array) {
			System.out.println(cadena);
		}
	}
	
	/**
	 * Dados un array de cadenas y una posición del mismo, obtiene la palabra de esa posición
	 * @param array Array de cadenas
	 * @param num posición del array
	 * @return la cadena que está en la posición num del array.
	 */
	public static String obtenerPalabra(String[] array, Integer num) {
		if (num >= 0 && num < array.length) {
			// num es una posición válida del array
			return array[num];
		}
		
		return ""; // si la posición no es válida.
	}
	
		
	/**
	 * Dados un array de cadenas y una palabra, obtiene la posición donde se encuentra la palabra en caso que exista. Caso contrario devuelve -1.
	 * @param array Array de cadenas
	 * @param palabra a buscar en el array
	 * @return la posición de la palabra en el array o -1 si no la encuentra.
	 */
	public static Integer buscarPalabra (String[] array, String palabra) {
		for (int i = 0; i < array.length; i++) {
			if (array[i].equals(palabra)) {
				return i;
			}
		}
		// en caso de que no esté la palabra a buscar.
		return -1;
	}
	
	
	
	
	
}
