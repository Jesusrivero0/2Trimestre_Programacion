package ejercicio08;

public class Ejercicio08 {
	
	public static void main(String[] args) {
		
		Integer result1 = Calculadora.calcular(Calculadora.SUMAR, 8, 4);
		Integer result2 = Calculadora.calcular(Calculadora.RESTAR, 8, 4);
		Integer result3 = Calculadora.calcular(Calculadora.MULTIPLICAR, 8, 4);
		Integer result4 = Calculadora.calcular(Calculadora.DIVIDIR, 8, 4);
		System.out.println(result1);
		System.out.println(result2); 
		System.out.println(result3);
		System.out.println(result4);
	}
	
}
