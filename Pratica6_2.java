package estruturascontrole;

import java.util.Scanner;

//Prática 6.2 - Programa simples que soma os elementos um array fornecido pelo usuário
public class Pratica6_2 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int[] numeros = new int[7]; 
		int soma=0;
		
		for (int i=0; i<numeros.length; i++){
			
			System.out.println("Forneça o elemento de índice "+i);
			numeros[i]=sc.nextInt();
			soma+=numeros[i];
		}
	
		System.out.println("Soma = "+soma);
		sc.close();

	}

}
