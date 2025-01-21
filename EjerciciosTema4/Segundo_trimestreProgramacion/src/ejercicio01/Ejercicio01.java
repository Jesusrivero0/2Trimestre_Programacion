package ejercicio01;

public class Ejercicio01 {
	
	public static void main(String[] args) {
		
		String resultado = getMayusculas(" ¿Que tal?      ");
		System.out.println(resultado);
		
	}
		
	public static String getMayusculas(String cadena) {
		return cadena.trim().toUpperCase();
	}
	
	
}
