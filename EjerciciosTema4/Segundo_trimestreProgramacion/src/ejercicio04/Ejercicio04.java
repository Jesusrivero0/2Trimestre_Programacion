package ejercicio04;

import ejercicio01.Ejercicio01;
import ejercicio02.Ejercicio02;

public class Ejercicio04 {
	
	public static void main(String[] args) {
		
		System.out.println("Maysculas (1): ");
		System.out.println(getMayMin(1,"   Pasar a Mayusculas     "));
		System.out.println("Minsculas (2): ");
		System.out.println(getMayMin(2,"   Pasar a Minusculas     "));
	}
	
	
	public static String getMayMin(Integer num, String cadena ) {
		

		if(num==1)
			cadena= Ejercicio01.getMayusculas(cadena);
		else if(num==2)
			cadena= Ejercicio02.getMinusculas(cadena);
		
		return cadena;
	}
	
	
}
