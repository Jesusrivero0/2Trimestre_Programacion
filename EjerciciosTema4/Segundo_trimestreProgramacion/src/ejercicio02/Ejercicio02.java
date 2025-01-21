package ejercicio02;

public class Ejercicio02 {
	
	public static void main(String[] args) {
		
		String resultado = getMinusculas("   ¿Cómo estas?     ");
		System.out.println(resultado);
		
		
	}
	

	
	public static String getMinusculas(String cadena) {
		return cadena.trim().toLowerCase();
	}
}

