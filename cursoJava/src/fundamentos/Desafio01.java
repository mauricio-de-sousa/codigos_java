package fundamentos;

import java.util.Scanner;

public class Desafio01 {
	public static void main(String[] args) {
		// (F° - 32) * 5/9 = C° 
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Temperatura fahrenheit :");
		double fahrenheit = entrada.nextDouble();
		double fator = 5.0/9.0;
		double ajuste = 32;
		
		double celsius = (fahrenheit - ajuste) * fator;
		
		System.out.println(fahrenheit+"°"+ " Graus fahrenheit " + " convertido para Celsius = " + celsius +"°"+" graus Celsius");
		
		entrada.close();
	}

}
