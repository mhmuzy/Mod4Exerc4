package Hitss.Treinamento.Apresentacao;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
	
		try {
			System.out.println("");
			System.out.println("      Hitss Treinamento");
			System.out.println("");
			System.out.println("Fórmula de báskara");
			System.out.println("");
		double x, a,b,c,res;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o valor de A:");
		System.out.println("");
		a = teclado.nextInt();
		System.out.println("");
		System.out.println("Digite o vaor de B:");
		System.out.println("");
		b = teclado.nextInt();
		System.out.println("");
		System.out.println("Digite o valor de C:");
		System.out.println("");
		c = teclado.nextInt();
		System.out.println("");
		
		res = 0;
		 res = ((a*(res * res)) + (b * res) + c);
		 
		 
		 System.out.println("O Resultado do resultado da f´romula de baskara é : " + res);
		} catch (Exception e) {
			System.out.println("Erro de processamento: " + e.getMessage());
		} 
	}
}
