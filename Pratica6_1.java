
//Prática 6.1 - Programa simples que declara um array e soma seus elementos
public class Pratica6_1 {

	public static void main(String[] args) {

		int[] numeros = {10,23,45,60,5,8,23};
		int soma=0;
		
		for(int i=0; i<numeros.length; i++) {
			soma+=numeros[i];
		}
		
		System.out.println("Soma = "+soma);
	}

}
