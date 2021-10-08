package com.bridgelabz;

import java.util.Scanner;

public class VowelConsonant {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char alphabet;
		System.out.print("Enter any character : ");
		alphabet = scanner.next().charAt(0);
		if(alphabet == 'a' || alphabet =='e' || alphabet =='i' || alphabet == 'o'|| alphabet == 'u' ) {
			System.out.println("Alphabet is vowel");
			
		}
		else {
			System.out.println("Alphabet is Consonant");
		}
		
	}

}
