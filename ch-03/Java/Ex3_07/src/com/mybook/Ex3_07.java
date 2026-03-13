/*
 * Exercício 3.7
 * 
 * Faça um programa que peça dois números inteiros ao
 * usuário. Imprima a soma destes dois números na tela.
 */


package com.mybook;

import java.util.Scanner;

/**
 * Classe que realiza uma operação matemática básica de soma entre dois números.
 * 
 * @autor Fabio H
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
		
		System.out.print("SOMA = " + soma(num1, num2));
		
		sc.close();
	}
	
	/**
	 * Realiza a operação de soma entre dois números.
	 * 
	 * @param num1	O primeiro número a ser somado.
	 * @param num2	O segundo número a ser somado.
	 * 
	 * @return		O valor da soma dos dois números.
	 */
	
	static int soma(int num1, int num2)
	{
		return (num1 + num2);
	}
}