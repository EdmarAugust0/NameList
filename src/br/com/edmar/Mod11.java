package br.com.edmar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Mod11 {
	public static void main(String args[]) {
		nameList();
	}

	private static void nameList() {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Diga o nome do primeiro aluno: ");
		String firstName = s.next();
		System.out.println("Diga o nome do segundo aluno: ");
		String secondName = s.next();
		System.out.println("Diga o nome do terceiro aluno: ");
		String thirdName = s.next();
		System.out.println("Diga o nome do quarto aluno: ");
		String fourthName = s.next();
		

		List<String>lista = new ArrayList<String>();
		lista.add(firstName);
		lista.add(secondName);
		lista.add(thirdName);
		lista.add(fourthName);
		
		Collections.sort(lista);
		
		System.out.println(lista);
	}
	
}
