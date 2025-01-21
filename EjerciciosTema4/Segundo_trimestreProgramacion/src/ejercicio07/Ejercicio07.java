package ejercicio07;

public class Ejercicio07 {
	
	public static void main(String[] args) {
		
		Integer resultado = Calculadora.sumar(4, 2);
		System.out.println(resultado);
		
		resultado = Calculadora.restar(4, 2);
		System.out.println(resultado);
		
		resultado = Calculadora.multiplicar(4, 2);
		System.out.println(resultado);
		
		resultado = Calculadora.dividir(4, 2);		
		System.out.println(resultado);
		
		resultado = Calculadora.dividir(4, 0);		
		System.out.println(resultado);
		
		
	}
	
}
