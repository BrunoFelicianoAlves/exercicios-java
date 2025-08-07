package br.exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class exercicio01 {

	public static void main(String[] args) {

//		System.out.println("Printar todos os números de um array");
//		int[] num1 = {10, 20, 30, 40, 50};
//		int[] num2 = {35, 25, 35, 45, 55};

//		for(int i = 0; i < num1.length; i++) {
//			System.out.print(num1[i] + " ");
//		}

		// ______________________________________________________________________________________________________
//		System.out.println("\n\nPrintar todos os números de um array");
//		for(int i = 0; i < num2.length; i++) {
//			System.out.println(num2[i] + " ");
//		}
//		
//		System.out.println("\n\nPrintar todos os numeros de um array em ordem crescente e descrecente");
//		for(int i = num2.length - 1; i >= 0; i--) {
//			System.out.println(num2[i] + " ");
//		}

		// ______________________________________________________________________________________________________
//		System.out.println("\n\n3) Printar todos os números de uma lista");
//		List<Integer> num3 = new ArrayList<>();
//		num3.add(11);
//		num3.add(12);
//		num3.add(13);
//		num3.add(14);
//
//		for (Integer nums : num3) {
//			System.out.println(nums + " ");
//		}

		// ______________________________________________________________________________________________________
//		System.out.println("\n\n4)Printar todos os números de uma lista em ordem crescente e decrescente");
//		List<Integer> num4 = new ArrayList<>();
//		num4.add(32);
//		num4.add(12);
//		num4.add(42);
//		num4.add(22);
//
//		Collections.sort(num4);
//		
//		for(int i = 0; i < num4.size(); i++) {
//			System.out.println(num4);
//		}
//		
//		for(int i = num4.size() -1; i >= 0; i--) {
//			System.out.println(num4.get(i));
//		}

		// ______________________________________________________________________________________________________
//		System.out.println("\n\n5) Recuperar o maior número de um array");
//		int[] num5 = { 1, 2, 3, 4, 5 };
//
//		int comparaNum = 0;
//		int menorNum = 0;
//		int maiorNum = num5.length;
//
//		for (int i = 0; i < num5.length; i++) {
//			if(num5[i] == num5.length) {
//				System.out.println("O número atual do array é " + num5[i]);
//				maiorNum = num5[i];
//				System.out.println("O maior número do array é " + maiorNum);
//			}
//		}

		// ______________________________________________________________________________________________________
		System.out.println("\n\n6)Recuperar o menor número de um array.");

		int[] num5 = { 17, 4, 28, 72, 50, 3, 99, 2, 122, 1, 130 };
		int cont = 1;
		int atualNum = 0;
		int menorNum = 0;
		int numEcontrado = 0;

		for (int i = 0; i < num5.length; i++) {
			System.out.print(num5[i] + " ");
			menorNum = num5[i];
			if (menorNum <= atualNum) {
				if (cont == 1) {
					numEcontrado = num5[i];
				} else if (menorNum <= numEcontrado) {
					numEcontrado = menorNum;
					//System.out.println("Menor número encontrado: " + numEcontrado+ " ");
				}
				cont++;
			}
			atualNum = num5[i];
		}
		System.out.println("\nO menor número é: " + numEcontrado);
	}

	// _________________________________________________________________________________________________________
//		System.out.println("\n\n6.1)Recuperar o menor número de um array.");
//
//		int[] num5 = { 17, 3, 28, 72, 50, 2, 99, 4, 122, 1, 130 };
//
//		int menorNum = num5[0];
//
//		for (int i = 1; i < num5.length; i++) {
//			if (num5[i] < menorNum) {
//				menorNum = num5[i];
//			}
//			System.out.print(num5[i] + " ");
//		}
//		System.out.println("\nO menor número é: " + menorNum);
//	}

	// ________________________________________________________________________________________________________
//		System.out.println("\n\n6.2)Recuperar o menor número de um array.");
//		int[] num5 = { 17, 3, 28, 72, 50, 2, 99, 4, 122, 1, 130 };
//
//		int menorNum = num5[0];
//
//		for (int num : num5) {
//			System.out.print(num + " ");
//			if (num < menorNum) {
//				menorNum = num;
//			}
//		}
//		System.out.println("\nO menor número é: " + menorNum);
//	}

	// _________________________________________________________________________________________________________

}