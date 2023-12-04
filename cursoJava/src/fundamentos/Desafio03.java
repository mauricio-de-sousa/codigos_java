package fundamentos;

import java.util.Scanner;
public class Desafio03 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int quantidade = 0;
		double nota = 0;
		double total = 0;
		
		while(nota != -1) {
			System.out.println("informe a nota");
			nota = entrada.nextDouble();
			
			total += nota;
			quantidade++;
			
		}
		
		double media = total / quantidade;
		System.out.println("A media e = "+media);
		entrada.close();
		
	}

}
