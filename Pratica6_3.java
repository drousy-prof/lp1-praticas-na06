package estruturascontrole;

import java.util.Scanner;
import java.util.Arrays;

//Prática 6.3 - Soma os elementos do array fornecido pelo usuário e classifica-o em ordem crescente
public class Pratica6_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numeros = new int[7]; 
		int soma=0;
		
		for (int i=0; i<numeros.length; i++){
			
			System.out.println("Forneça o elemento de índice "+i);
			numeros[i]=sc.nextInt();
			soma+=numeros[i];
		}
		
		Arrays.sort(numeros);
		
		System.out.println("Array classificado de forma crescente:");
		for(int i:numeros) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println(Arrays.toString(numeros)+ " Soma = "+soma);
		sc.close();

	}

}
