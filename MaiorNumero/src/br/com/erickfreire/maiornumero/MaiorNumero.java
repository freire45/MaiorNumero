package br.com.erickfreire.maiornumero;

import java.util.Scanner;

/**
 * Programa em Java que recebe 10 numeros e verifica qual é o maior.
 * @author Erick Freire
 * @version 1 - Criado em 08-04-2021 as 23:25
 */

public class MaiorNumero {
	public static void main(String[] args) {
		
		int contador = 1;
		int numero = 0;
		int maior = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		while(contador <= 10) {
			System.out.print("Digite um número inteiro: ");
			numero = entrada.nextInt();
			
			if(numero > maior)
				maior = numero;
			
			contador++;
		}
		
		System.out.printf("O maior valor é: %s%n", maior);
		
		
		
	}

}
