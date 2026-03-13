/*
 * Exercício 3.7
 * 
 * Faça um programa que peça dois números inteiros ao
 * usuário. Imprima a soma destes dois números na tela.
 */


package com.mybook;

import java.util.Scanner;

public class Ex3_07
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		
		int num1, num2;
		
		System.out.println("Digite o valor do PRIMEIRO número: ");
		num1 = sc.nextInt();
		
		System.out.println("Digite o valor do SEGUNDO número: ");;
		num2 = sc.nextInt();
		
		System.out.println("SOMA = " +(num1 + num2));
		
		sc.close();
	}
}