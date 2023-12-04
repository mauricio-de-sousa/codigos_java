package fundamentos;
import java.util.Scanner;
public class Desafio02 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Salario 1 :");
		String valor1 = entrada.nextLine().replace(",", ".");
		
		System.out.println("Salario 2 :");
		String valor2 = entrada.nextLine().replace(",", ".");
		
		System.out.println("Salario 3 :");
		String valor3 = entrada.nextLine().replace(",", ".");
		
		double salario1 = Double.parseDouble(valor1);
		double salario2 = Double.parseDouble(valor2);
		double salario3 = Double.parseDouble(valor3);
		
		double mediaSalario = (salario1 + salario2 + salario3) /3;
		
		System.out.println("A media salarial e de : "+mediaSalario);
		entrada.close();
	}

}
