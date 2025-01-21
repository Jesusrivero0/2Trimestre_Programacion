package ejercicio08;

public class Calculadora {
	
	public static final String SUMAR 		= "ADD";
	public static final String RESTAR 		= "SUB";
	public static final String MULTIPLICAR 	= "MUL";
	public static final String DIVIDIR 		= "DIV";
	
	
	/**
	 * Calcula una operación matemática entre dos números a y b. 
	 * @param operacion Tipo de la operación. Valores permitidos: ADD, SUB, MUL DIV
	 * @param a Primer número
	 * @param b Segundo número
	 * @return Devuelve el resultado de la operación. Si la operación no está entre los valores permitidos devuelve null.
	 */
	public static Integer calcular(String operacion, Integer a, Integer b) {
		switch (operacion) {
		case SUMAR:
			return sumar(a, b);
		case RESTAR:
			return restar(a, b);
		case MULTIPLICAR:
			return multiplicar(a, b);
		case DIVIDIR:
			return dividir(a, b);
		default:
			return null;
		}
	}
	
	/**
	 * Devuelve la suma de a y b
	 * @param a primer entero a sumar
	 * @param b segundo entero a sumar
	 * @return la suma de a y b 
	 */	
	public static Integer sumar(Integer a, Integer b) {
		return a+b;
	}
	
	/**
	 * Realiza  la resta de a y b
	 * @param a es el minuendo
	 * @param b es el sustraendo
	 * @return el resultado de la operación de restar a y b
	 */
	public static Integer restar(Integer a, Integer b) {
		return a-b;
	}
	
	/**
	 * Realiza la multiplicación de dos números a y b
	 * @param a es el primer número a multiplicar
	 * @param b es el segundo número a multiplicar
	 * @return el resultado de multiplicar a y b
	 */
	public static Integer multiplicar(Integer a, Integer b) {
		return a*b;
	}
	
	/**
	 * Realiza la división de a y b
	 * @param a Es el dividendo de la operación
	 * @param b Es el divisor de la operación
	 * @return el cociente de la operación. El resultado de dividir a entre b. 
	 */
	public static Integer dividir(Integer a, Integer b) {
		
		if(b==0)
			return 0;
		else
			return a/b;
			
		/* otra forma:
		 
		if(b==0)
			return 0;
		return a /b;
		*/
	}
	
	
}
