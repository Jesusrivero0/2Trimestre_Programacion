package Ejercicio03;

public class Ejercicio03 {
	
	public static void main(String[] args) {
		
		System.out.println(getMayMin(1,"   Buenos das     "));
		System.out.println(getMayMin(2,"   Introduccin     "));
		System.out.println(getMayMin(3,"   Conclusin     "));
	}
	
	
	public static String getMayMin(Integer num, String cadena ) {
		
		
		if(num==1)
			cadena= cadena.trim().toUpperCase();
		else if(num==2)
			cadena= cadena.trim().toLowerCase();
		
		return cadena;
	}
	
	
}

