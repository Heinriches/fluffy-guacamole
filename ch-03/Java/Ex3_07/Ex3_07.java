/*
 * Exercício 3.7
 * 
 * Escreva um programa que peça ao usuário dois números inteiros.
 * Imprima a soma destes dois números na tela.
 */

import java.util.Scanner;


/**
 * Realiza uma simples soma matemática entre dois números.
 * 
 * @author Fabio H
 * @version 1.0
 */
public class Ex3_07
{	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		
		System.out.print("Digite o valor do PRIMEIRO número: ");
		int num1 = sc.nextInt();

		System.out.print("Digite o valor do SEGUNDO número: ");
		int num2 = sc.nextInt();

		System.out.println("SOMA = " + soma(num1, num2));

		sc.close();
	}

	/**
	 * Método que realiza a soma entre dois números.
	 * 
	 * @param num1	O primeiro número a ser somado.
	 * @param num2	O segundo número a ser somado.
	 * 
	 * @return		O valor da soma entre dois números.
	 */
	static int soma(int num1, int num2)
	{
		return (num1 + num2);
	}
}